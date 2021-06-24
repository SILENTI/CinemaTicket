package com.juwuhe.controller;

import com.juwuhe.entity.User;
import com.juwuhe.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/test")
    @ResponseBody
    public List<User> test () {
        List<User> users = userServiceImpl.selectUserInfo();
        System.out.println(users);
        return users;
    }
}
