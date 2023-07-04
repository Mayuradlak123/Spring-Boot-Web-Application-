package com.example.demo.Services;

public class loginService {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "loginService{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
