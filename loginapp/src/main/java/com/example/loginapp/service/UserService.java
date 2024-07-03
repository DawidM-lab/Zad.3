package com.example.loginapp.service;

import com.example.loginapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final String VALID_LOGIN = "dawid";
    private static final String VALID_PASSWORD = "123";

    public boolean isValidUser(User user) {
        return VALID_LOGIN.equals(user.getLogin()) && VALID_PASSWORD.equals(user.getPassword());
    }
}
