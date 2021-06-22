package com.juwuhe.service.impl;

import com.juwuhe.dao.UserDao;
import com.juwuhe.entity.User;
import com.juwuhe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectUserInfo() {
        return userDao.selectUserInfo();
    }
}
