package com.juwuhe.dao;

import com.juwuhe.entity.Paly;
import java.util.List;

public interface PalyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Paly record);

    Paly selectByPrimaryKey(Integer id);

    List<Paly> selectAll();

    int updateByPrimaryKey(Paly record);

    List<Paly> selectByFilmKey (String film_id);
}