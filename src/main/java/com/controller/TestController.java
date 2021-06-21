package com.controller;

import com.entity.UserInfo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public List<UserInfo> test () {
        List<UserInfo> userInfos = userService.selectUserInfo();
        System.out.println(userInfos);
        return  userInfos;
    }
}
