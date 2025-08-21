package com.example.investment_portfolio.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("Cannot find user with id: " + id );
    }
}
