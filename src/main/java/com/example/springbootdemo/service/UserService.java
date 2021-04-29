package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Country;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUsersByAge(int age) {
        return userRepository.findAllByAge(age);
    }

    public User getUsersByName(String name) {
        return userRepository.findByName(name);
    }

    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return String.format("%d Deleted Successfully!", id);
    }

    public User getUserFromNameAndPassword(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }

}
