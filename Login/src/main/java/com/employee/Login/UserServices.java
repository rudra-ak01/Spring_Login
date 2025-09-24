package com.employee.Login;

import org.springframework.stereotype.Service;

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
