package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final HomeModel user;

    @Autowired
    public UserController(HomeModel userRepository) {
        this.user = userRepository;
    }

    @Value("${usermodel.name}")
    public String name;

    @Value("${usermodel.age}")
    public String age;

    @Value("${usermodel.tel}")
    public String tel;


    @GetMapping
    public String getUser(){
        System.out.println(user);
        System.out.println(user.name + user.age);
        return name + age + tel;
    }

    @RequestMapping("/json")
    public HomeModel second(){
        HomeModel u = new HomeModel();
//        u.setName("小明");
//        u.setAge("30");
//        u.setGender("女");
        return u;
    }

    @GetMapping("1")
    public String third(String name, Integer age){
        System.out.println(name);
        System.out.println(age);
        return name + age.toString();
    }

    @GetMapping("2")
    public HomeModel getParam(HomeModel user){
        System.out.println(user);
        // 将接收到的参数直接返回
        return user;
    }

    // 注意，User中一定要有无参构造方法
    @PostMapping("postJson")
    public HomeModel postJson(@RequestBody HomeModel user){
        return user;
    }



}
