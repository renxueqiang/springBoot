package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true,service.getById(id));
    }


    @GetMapping ("/all")
    public  R getAll() {
        return new R(true,service.list());
    }


    @GetMapping("/{currentpage}/{pageSize}")       
    public List<User> getAll(@PathVariable Integer currentpage, @PathVariable Integer pageSize) {
//                return service.getPage(currentPage, pagesize).getRecords();
        System.out.println(currentpage.toString() + pageSize.toString());
        return service.list();
    }


}
