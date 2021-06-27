package com.juwuhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/UserLogin")
    public void Login (String username , String password){
        System.out.println(username+"  "+password);
    }
}
