package com.juwuhe.dao;

import com.juwuhe.entity.Paly;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PalyMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("playId") String playId);

    int insert(Paly record);

    Paly selectByPrimaryKey(@Param("id") Integer id, @Param("playId") String playId);

    List<Paly> selectAll();

    int updateByPrimaryKey(Paly record);
}