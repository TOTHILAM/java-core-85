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
    public List<User> findEployeeByProjectId(int projectId) {
        return service.findEployeeByProjectId(projectId);
    }

    /**
     * @return danh các manager
     */
    public List<User> findManager() {
        return service.findManager();
    }

    /**
     * @param email email manager
     * @param password password manager
     * @return manager thông tin manager tương ứng với email và password
     * hoặc null nếu đăng nhập thất bại
     */
    public User findManagerByEmailAndPassword(String email, String password) {
        return service.findManagerByEmailAndPassword(email, password);
    }
}
