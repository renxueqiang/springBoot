package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "usermodel")
public class UserM {
    public String name;

    public String age;

    public String tel;
    public List<String> arr;

}