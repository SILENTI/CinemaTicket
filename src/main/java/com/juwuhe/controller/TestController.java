package com.juwuhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/Test")
    public String Test (){
        return "Test";
    }
}
