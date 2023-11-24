package com.example.demo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserModelMapper,User> implements UserService {

       @Autowired
       private  UserModelMapper userMapper;
    public Boolean deleteUser(Integer id){
       return userMapper.deleteById(id) > 0;
    }
    public Boolean insertUser(User user){
        return userMapper.insert(user) > 0;
    }
}
