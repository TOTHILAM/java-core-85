package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
// tạo getter setter nhanh nhờ thư viện lombok
@Getter
@Setter
public class User {
    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private Role role;
    private String proSkill;
    private Integer expInYear;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public void setExpInYear(Integer expInYear) {
        this.expInYear = expInYear;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public String getProSkill() {
        return proSkill;
    }

    public Integer getExpInYear() {
        return expInYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public enum Role {
        EMPLOYEE, ADMIN
    }
}
