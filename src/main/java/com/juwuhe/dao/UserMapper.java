package com.juwuhe.dao;

import com.juwuhe.entity.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();

    User selectByUserKey (String username,String password);
}