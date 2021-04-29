package com.example.springbootdemo.model;

import com.example.springbootdemo.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

@Data
@NoArgsConstructor
@ToString
public class UserModel {
    private static final long serialVersionUID = 1L;
    //private int id;
    private String name;
    private int age;
    //private Country country;

    public UserModel(User entity) {
        //this.id = entity.getId();
        this.name = entity.getName();
        this.age = entity.getAge();
        //this.country = entity.getCountry();
    }
}
