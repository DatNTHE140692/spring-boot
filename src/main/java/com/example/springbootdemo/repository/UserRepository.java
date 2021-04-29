package com.example.springbootdemo.repository;

import com.example.springbootdemo.entity.Country;
import com.example.springbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByAge(int age);

    User findByName(String name);

    User findByNameAndPassword(String name, String password);

}
