package com.vti.controller;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//@AllArgsConstructor
public class UserController {
    private IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    /**
     * @return danh sách user trong database
     */
    public List<User> findAll() {
        return service.findAll();
    }

    /**
     * @param id định dạng của user
     * @return thông tin user tương ứng với với id, hoặc null nếu không tồn tại
     */
    public User findById(int id) {
        return service.findById(id);
    }

    /**
     * @param id định dạng của user
     * @return số bản ghi được xoá
     */
    public int deleteById(int id) {
        return service.deleteById(id);
    }

    /**
     * Cách dùng:
     * <pre>{@code
     * controller.create("Tô Thị Lâm", "lam@gmail.com")
     * }
     * @param fullName Họ và tên của user
     * @param email Email của user
     * @return Số bản ghi được tạo thành công
     */
    public int create(String fullName, String email) {
        return service.create(fullName, email);
    }

    /**
     * @param email    Email của user
     * @param password Mật khẩu của user
     * @return Thông tin user tương ứng với email và password,
     * hoặc null nếu đăng nhập thất bại
     */
    public User findByEmailAndPassword(String email, String password) {
        return service.findByEmailAndPassword(email, password);
    }
}
