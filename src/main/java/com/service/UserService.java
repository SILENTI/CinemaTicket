package com.service;

import com.dao.UserDao;
import com.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<UserInfo> selectUserInfo () {
       return userDao.selectUserInfo() ;
    }
}
