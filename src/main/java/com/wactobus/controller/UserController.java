package com.wactobus.controller;

import com.wactobus.model.User;
import com.wactobus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private UserService userService;
    
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            logger.info("Attempting to create user: {}", user.getEmail());
            User createdUser = userService.createUser(user);
            logger.info("Successfully created user with ID: {}", createdUser.getId());
            return ResponseEntity.ok(createdUser);
        } catch (Exception e) {
            logger.error("Error creating user: ", e);
            throw new RuntimeException("Error creating user: " + e.getMessage());
        }
    }
}