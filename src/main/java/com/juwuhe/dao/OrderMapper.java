package com.juwuhe.dao;

import com.juwuhe.entity.Order;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("ordercol") String ordercol);

    int insert(Order record);

    Order selectByPrimaryKey(@Param("id") Integer id, @Param("ordercol") String ordercol);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}