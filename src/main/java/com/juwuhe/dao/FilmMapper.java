package com.juwuhe.dao;

import com.juwuhe.entity.Film;

import java.util.List;

public interface FilmMapper {

    List<Film> selectFilm ();

    Film selectFilmInfo (String filmid) ;
}
