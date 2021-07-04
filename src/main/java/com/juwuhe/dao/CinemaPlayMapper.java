package com.juwuhe.dao;

import com.juwuhe.entity.CinemaPlay;
import com.juwuhe.entity.Paly;

import java.util.List;

public interface CinemaPlayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CinemaPlay record);

    CinemaPlay selectByPrimaryKey(Integer id);

    List<CinemaPlay> selectAll();

    int updateByPrimaryKey(CinemaPlay record);

    List<CinemaPlay> selectByFilmKey (String film_id);

    Paly selectByPlayID (String film_id);
}