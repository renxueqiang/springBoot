package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //使用自动装配将所有数据封装到一个对象Environment中
    @Autowired
    private Environment env;

    @Autowired
    private UserM user;
    @GetMapping("/")
    public String hello() {
        //第一种读取方式
        System.out.println("hahhaha1"+env.getProperty("usermodel.name"));

        //第二种读取方式
        System.out.println(user);

        //第三种读取方式   @Value("${usermodel.name}")

        return "Hello, World!";
    }
}
