package com.juwuhe.dao;

import com.juwuhe.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();

    User selectByUserKey (@Param("username") String username,@Param("password") String password);
}