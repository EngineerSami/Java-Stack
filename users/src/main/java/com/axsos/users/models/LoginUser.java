package com.axsos.users.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class LoginUser {
    @NotNull(message = "Email is required.")
    @Email(message = "Must be a valid email.")
    private String email;

    @NotNull(message = "Password is required.")
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
}