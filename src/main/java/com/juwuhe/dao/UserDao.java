package com.juwuhe.dao;

import com.juwuhe.entity.User;

import java.util.List;


public interface UserDao {

    List<User> selectUserInfo();

}
