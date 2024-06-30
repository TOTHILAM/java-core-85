package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;

import java.util.List;

//@AllArgsConstructor
public class UserFunction {
    private UserController controller;

    public UserFunction(UserController controller) {
        this.controller = controller;
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Đăng nhập dành cho manager");
            System.out.println("2. Hiển thị danh sách Employee theo project id");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            switch (menu) {
                case 1: {
                    findManagerByIdAndPassword();
                    break;
                }
                case 2: {
                    findEployeeByProjectId();
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

    private void findEployeeByProjectId() {
        System.out.println("Nhập vào projectId");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findEployeeByProjectId(projectId);
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

    private void findManager() {
        List<User> users = controller.findManager();
        System.out.println("Danh sách manager là:");
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

    private void findManagerByIdAndPassword() {
        System.out.println("Mời bạn nhập thông tin đăng nhập");
        System.out.println("Mời bạn nhập email");
        String email = ScannerUtil.inputEmail();
        System.out.println("Mời bạn nhập password");
        String password = ScannerUtil.inputPassword();
        User user = controller.findManagerByEmailAndPassword(email, password);
        if (user == null) {
            System.out.println("Đăng nhập thất bại");
        } else {
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s.%n", user.getFullName(), role);
        }
    }
}
