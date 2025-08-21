package com.example.investment_portfolio.services;

import com.example.investment_portfolio.entities.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    User addUser(User user);
}
