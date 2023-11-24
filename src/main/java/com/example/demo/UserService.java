package com.example.demo;

import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {

    Boolean deleteUser(Integer id);

    Boolean insertUser(User user);
}
