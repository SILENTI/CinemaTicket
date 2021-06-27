package com.juwuhe.service.impl;

import com.juwuhe.dao.UserMapper;
import com.juwuhe.entity.User;
import com.juwuhe.service.UserService;
import com.juwuhe.util.ThreadLocalManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String selectUserByKey(String username, String password) {
        User user = userMapper.selectByUserKey(username,password);
        if (!user.getUsername().equals("")&&user.getUsername()!=null){
            ThreadLocal threadLocal = ThreadLocalManager.getTreadLocal(username);
            threadLocal.set(user);
            return "登录成功";
        }
        return "登录失败";
    }
}
