package com.juwuhe.service;

import com.juwuhe.vo.FilmInfoVo;
import com.juwuhe.vo.FilmVo;

import java.util.List;

public interface FilmService {

    List<FilmVo> selectFilm () ;

    FilmInfoVo selectFilmInfo (String filmid);

}
