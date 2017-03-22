package com.ducetech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ducetech.model.User;
import com.ducetech.model.UserMapper;

@RestController 
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下 
public class UserController {
	
    @Autowired
    private UserMapper userMapper;
    
    @RequestMapping(value="/", method=RequestMethod.GET) 
    public User getUserList() { 
        User user = userMapper.findByName("AA");
        return user; 
    } 

    
}
