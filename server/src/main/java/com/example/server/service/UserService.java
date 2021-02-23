package com.example.server.service;

import com.example.server.model.User;
import org.springframework.http.HttpStatus;

public interface UserService {
    Iterable<User> getUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser( User user);
    HttpStatus deleteUser(Long id);
}
