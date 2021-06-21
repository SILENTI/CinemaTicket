package com.dao;

import com.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {

    public List<UserInfo> selectUserInfo();

}
