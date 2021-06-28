package com.juwuhe.controller;

import com.juwuhe.entity.User;
import com.juwuhe.service.impl.UserServiceimpl;
import com.juwuhe.util.ThreadLocalManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
public class UserController {

    @RequestMapping("/Login")
    public String Login (){
        return "Login";
    }

    @Autowired
    private UserServiceimpl userServiceimpl;

    @RequestMapping("/UserLogin")
    public String UserLogin (@RequestParam("userName") String username , @RequestParam("passWord") String password , HttpServletRequest request){
        String judge = userServiceimpl.selectUserByKey(username,password);
      if (judge.equals("登录成功")){
          ThreadLocal threadLocal = ThreadLocalManager.getTreadLocal(username);
          User user = (User) threadLocal.get();
          request.getSession().setAttribute("user",user);
          return "redirect:Main";
      }
        return "redirect:Login";
    }

    @RequestMapping("/SignOut")
    public String SignOut (HttpServletRequest request) {
        Enumeration em = request.getSession().getAttributeNames();
        while(em.hasMoreElements()){
            request.getSession().removeAttribute(em.nextElement().toString());
        }
        return "redirect:Main";
    }

    @RequestMapping("/User")
    public String User () {
        return "User";
    }

}
