package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    // lấy ra tất cả danh sách user trong database
    @Override
    public List<User> findAll() throws SQLException, IOException {
        // tạo câu truy vấn
        String sql = "SELECT * FROM users";
        // truy vấn xong cần phải giải phóng tài nguyên nên dùng try ()
        try (
                // tạo một kết nối (không xủ lí ngooại lệ)
                Connection connection = JdbcUtil.getConnection();
                // tạo ra đối tượng của statement (câu lệnh) với cú pháp như sau
                Statement stmt = connection.createStatement();
                //dùng đối tượng statement để thực thi truy vấn
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            List<User> users = new LinkedList<>();
            //dùng while: trong khi vẫn còn dữ liệu thì trả về true
            while (rs.next()) {
                User user = new User();
                // truyền vào tên cột hoặc chỉ số cột bắt đầu từ 1...
                user.setId(rs.getInt("id"));
                user.setFullName(rs.getString("full_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                // lấy ra từ database cột role kiểu dữ liệu String
                String role = rs.getString("role");
                // chuyển sang kiểu dữ liệu Role; User.Role.valueOf(role);
                user.setRole(User.Role.valueOf(role));
                user.setProSkill(rs.getString("pro_skill"));
                user.setExpInYear(rs.getInt("exp_in_year"));
                users.add(user);
            }
            return users;
        }
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        //trong câu truy vấn dùng ? để thế dữ liệu cần tìm kiếm
        String sql = "SELECT * FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                // câu truy vấn có tham số (có dấu ?) dùng preparedstatement(câu truy vấn chuẩn bị)
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ) {
            // set cho dấu ? thứ mấy và cho biết nào. vd dấu ? thứ 1, biến id
            pStmt.setInt(1, id);
            try (ResultSet rs = pStmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setFullName(rs.getString("full_name"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    String role = rs.getString("role");
                    user.setRole(User.Role.valueOf(role));
                    user.setProSkill(rs.getString("pro_skill"));
                    user.setExpInYear(rs.getInt("exp_in_year"));
                    return user;
                }
                return null;
            }
        }
    }

    // phương thức xoá trả về một số nguyên thể hiện có bao nhiêu id được xoá
    @Override
    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setInt(1, id);
            // nếu như các câu truy vấn là insert, Update, delete thì dùng executeUpdate
            // trả về số nguyên đại diện chp số user được thêm, số user update, số user bị xoá
            return pStmt.executeUpdate();
        }
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        String sql = "INSERT INTO users (full_name, email) VALUES (?, ?)";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setString(1, fullName);
            pStmt.setString(2, email);
            return pStmt.executeUpdate();
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_by_email_and_password(?, ?)}";
        try (
                Connection connection = JdbcUtil.getConnection();
                // tạo câu lệnh có thể Call là CllableStatement
                CallableStatement cStmt = connection.prepareCall(sql)
        ) {
            cStmt.setString(1, email);
            cStmt.setString(2, password);
            try (ResultSet rs = cStmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setFullName(rs.getString("full_name"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    String role = rs.getString("role");
                    user.setRole(User.Role.valueOf(role));
                    user.setProSkill(rs.getString("pro_skill"));
                    user.setExpInYear(rs.getInt("exp_in_year"));
                    return user;
                }
                return null;
            }
        }
    }
}
