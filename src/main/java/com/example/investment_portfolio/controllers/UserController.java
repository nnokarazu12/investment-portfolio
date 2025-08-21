package com.example.investment_portfolio.controllers;

import com.example.investment_portfolio.entities.User;
import com.example.investment_portfolio.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserController {
    private UserService userService;

    @GetMapping
    public ResponseEntity<Void> hello() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<User> getAllUsers() {
        return ResponseEntity.ok(userService.)
    }

    @GetMapping("/{id}")
    ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
