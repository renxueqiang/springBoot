package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserM user;

    @Autowired
    public UserController(UserM userRepository) {
        this.user = userRepository;
    }

    @Value("${usermodel.name}")
    public String name;

    @Value("${usermodel.age}")
    public String age;

    @Value("${usermodel.tel}")
    public String tel;

    @Value("${usermodel.arr}")
    public List<String> arr;
    @GetMapping
    public String getUser(){
        System.out.println(user);
        System.out.println(user.name + user.age + user.tel);
        return name + age + tel;
    }
}
