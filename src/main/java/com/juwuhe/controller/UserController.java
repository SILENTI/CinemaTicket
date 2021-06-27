package com.juwuhe.controller;

import com.juwuhe.entity.User;
import com.juwuhe.service.impl.UserServiceimpl;
import com.juwuhe.util.ThreadLocalManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping("/Login")
    public String Login (){
        return "Login";
    }

    @Autowired
    private UserServiceimpl userServiceimpl;

    @RequestMapping("/UserLogin")
    public String UserLogin (@RequestParam("userName") String username , @RequestParam("passwWord") String password , HttpSession session){
      String judge = userServiceimpl.selectUserByKey(username,password);
      if (judge.equals("登录成功")){
          ThreadLocal threadLocal = ThreadLocalManager.getTreadLocal(username);
          User user = (User) threadLocal.get();
          session.setAttribute("user",user);
          return "redirect:Main";
      }
        return "redirect:Login";
    }

}
