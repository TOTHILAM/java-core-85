package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//@AllArgsConstructor
public class UserFunction {
    private UserController controller;

    public UserFunction(UserController controller) {
        this.controller = controller;
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            switch (menu) {
                case 1: {
                    findByIdAndPassword();
                    break;
                }
                case 2: {
                    findAll();
                    break;
                }
                case 3: {
                    findById();
                    break;
                }
                case 4: {
                    return;
                }
                default: {
                    System.err.println("Vui lòng nhập đúng chức năng");
                    System.err.println("Vui lòng nhập lại");
                }
            }
        }
    }

    private void showAdminMenu() {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Tìm kiếm user theo id");
            System.out.println("3. Thêm user");
            System.out.println("4. Xoá user theo id");
            System.out.println("5. Đăng xuất");
            System.out.println("Mời bạn chọn");
            int menu = ScannerUtil.inputInt();
            switch (menu) {
                case 1: {
                    findAll();
                    break;
                }
                case 2: {
                    findById();
                    break;
                }
                case 3: {
                    create();
                    break;
                }
                case 4: {
                    deleteById();
                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.err.println("Vui lòng nhập đúng chức năng");
                    System.err.println("Vui lòng nhập lại");
                }
            }
        }
    }

    private void showEmployeeMenu() {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Tìm kiếm user theo id");
            System.out.println("3. Đăng xuất");
            System.out.println("Mời bạn chọn");
            int menu = ScannerUtil.inputInt();
            switch (menu) {
                case 1: {
                    findAll();
                    break;
                }
                case 2: {
                    findById();
                    break;
                }
                case 3: {
                    return;
                }
                default: {
                    System.err.println("Vui lòng nhập đúng chức năng");
                    System.err.println("Vui lòng nhập lại");
                }
            }
        }
    }

    private void findAll() {
        List<User> users = controller.findAll();
        System.out.println("Danh sách users:");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }

    private void findById() {
        System.out.println("Nhập vào Id cần tìm");
        int id = ScannerUtil.inputInt();
        User user = controller.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (user == null) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            String fullName = user.getFullName();
            String email = user.getEmail();
            System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
            System.out.println("+------+--------------------+--------------------+");
        }
    }

    private void findByIdAndPassword() {
        System.out.println("Mời bạn nhập thông tin đăng nhập");
        System.out.println("Mời bạn nhập email");
        String email = ScannerUtil.inputEmail();
        System.out.println("Mời bạn nhập password");
        String password = ScannerUtil.inputPassword();
        User user = controller.findByEmailAndPassword(email, password);
        if (user == null) {
            System.out.println("Đăng nhập thất bại");
        } else {
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s.%n", user.getFullName(), role);
            if (role == User.Role.ADMIN) {
                showAdminMenu();
            } else if (role == User.Role.EMPLOYEE) {
                showEmployeeMenu();
            }
        }
    }

    private void deleteById() {
        System.out.println("Nhập vào id cần xoá: ");
        int id = ScannerUtil.inputInt();
        int result = controller.deleteById(id);
        System.out.printf("Đã xoá thành công %d user(s).%n", result);
    }

    private void create() {
        System.out.println("nhập vào fullName");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("nhập vào email");
        String email = ScannerUtil.inputEmail();
        int result = controller.create(fullName, email);
        System.out.printf("Đã tạo thành công %d user(s).%n", result);
    }
}
