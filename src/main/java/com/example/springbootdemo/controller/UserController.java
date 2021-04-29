package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Country;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.model.UserModel;
import com.example.springbootdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserModel> getUserList() {
        List<User> users = userService.getUserList();
        List<UserModel> userModels = new ArrayList<>();
        users.forEach(user -> userModels.add(new UserModel(user)));
        return userModels;
    }

    @GetMapping("/user/id/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/user/name/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUsersByName(name);
    }

    @GetMapping("/user/age/{age}")
    public List<User> getUsersByAge(@PathVariable int age) {
        return userService.getUsersByAge(age);
    }

    @PostMapping("/user/login")
    public UserModel getUser(@RequestBody User u) {
        return new UserModel(userService.getUserFromNameAndPassword(u.getName(), u.getPassword()));
    }

    @DeleteMapping("/remove/id/{id}")
    public String removeUserById(@PathVariable int id) {
        return userService.deleteUserById(id);
    }

}
