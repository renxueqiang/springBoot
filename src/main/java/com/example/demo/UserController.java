package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;
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
        System.out.println(user.name + user.age);
        return name + age + tel;
    }

    @RequestMapping("/json")
    public UserM second(){
        UserM u = new UserM();
        u.setName("小明");
        u.setAge(30);
        u.setGender("女");
        return u;
    }

    @GetMapping("1")
    public String third(String name, Integer age){
        System.out.println(name);
        System.out.println(age);
        return name + age.toString();
    }

    @GetMapping("2")
    public UserM getParam(UserM user){
        System.out.println(user);
        // 将接收到的参数直接返回
        return user;
    }

    // 注意，User中一定要有无参构造方法
    @PostMapping("postJson")
    public UserM postJson(@RequestBody UserM user){
        return user;
    }



}
