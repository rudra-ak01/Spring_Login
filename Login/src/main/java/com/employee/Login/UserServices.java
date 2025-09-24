package com.employee.login;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    private final UserRepository userRepository;

    // Constructor-based injection
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Login method
    public User login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
