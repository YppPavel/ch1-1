package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * created by liubao on 2018/5/10
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user=new User();
        user=this.userRepository.findOne(id);
        return user;
    }
}
