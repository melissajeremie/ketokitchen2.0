package com.example.server.controller;


import com.example.server.model.User;
import com.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Iterable<User> getUsers() {return userService.getUsers(); }

    @PostMapping
    public User createUser(@RequestBody User user) { return userService.createUser(user); }

    @PatchMapping
    public User updateUser(@RequestBody User user) { return userService.updateUser(user); }

    @DeleteMapping("/{id}")
    public HttpStatus deleteUser(@PathVariable Long id) { return userService.deleteUser(id); }
}
