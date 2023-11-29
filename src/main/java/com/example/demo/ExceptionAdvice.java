package com.example.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
     @ExceptionHandler(Exception.class)
    public  R  exception(Exception ex){

        System.out.println("hahahahhah----------我错了");

          return new R(false,"请稍后重试");
    }
}
