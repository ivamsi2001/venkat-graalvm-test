package com.venkat.controllers;

import com.venkat.entity.User;
import com.venkat.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserMasterController {

    private final UserRepository userRepository;

    public UserMasterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/add")
    public User addNewUser(@RequestParam String name, @RequestParam String email) {
        return userRepository.save(new User(name, email));
    }

    @GetMapping(path = "/all")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}