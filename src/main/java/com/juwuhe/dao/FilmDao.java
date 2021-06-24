package com.juwuhe.dao;

import com.juwuhe.entity.Film;

import java.util.List;

public interface FilmDao {

    List<Film> selectFilm ();

    Film selectFilmInfo (String filmid) ;
}
