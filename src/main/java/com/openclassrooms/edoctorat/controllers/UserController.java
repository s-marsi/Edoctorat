package com.openclassrooms.edoctorat.controllers;

import com.openclassrooms.edoctorat.models.UserModel;
import com.openclassrooms.edoctorat.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable long id) {
        return userService.getUserById(id);
    }
}