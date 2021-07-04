package com.juwuhe.dao;

import com.juwuhe.entity.AdminUser;
import java.util.List;

public interface AdminUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminUser record);

    AdminUser selectByPrimaryKey(Long id);

    List<AdminUser> selectAll();

    int updateByPrimaryKey(AdminUser record);
}