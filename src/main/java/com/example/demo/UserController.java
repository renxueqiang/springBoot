package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return service.getById(id);
    }


    @GetMapping
    public List<User> getAll() {
        return service.list();
    }


    @GetMapping("/{currentpage}/{pageSize}")       
    public List<User> getAll(@PathVariable Integer currentpage, @PathVariable Integer pageSize) {
//                return service.getPage(currentPage, pagesize).getRecords();
        System.out.println(currentpage.toString() + pageSize.toString());
        return service.list();
    }


}
