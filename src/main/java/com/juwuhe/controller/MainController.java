package com.juwuhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/Main")
    public String Main (){
        return "Main";
    }

}
