package com.juwuhe.service.impl;

import com.juwuhe.dao.FilmMapper;
import com.juwuhe.entity.Film;
import com.juwuhe.service.FilmService;
import com.juwuhe.vo.FilmInfoVo;
import com.juwuhe.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceimpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public List<FilmVo> selectFilm() {
        List<Film> films = filmMapper.selectFilm();
        ArrayList<FilmVo> filmVos = new ArrayList<>();
        for (Film film : films){
            FilmVo filmVo = new FilmVo();
            filmVo.setFilmId(film.getFilm_id());
            filmVo.setName(film.getName());
            filmVo.setDirector(film.getDirector());
            filmVo.setImgPath(film.getImg_path());
            filmVos.add(filmVo);
        }
        return filmVos;
    }

    @Override
    public FilmInfoVo selectFilmInfo(String filmid) {
            Film film = filmMapper.selectFilmInfo(filmid);
           FilmInfoVo infoVo =  new FilmInfoVo();
           infoVo.setName(film.getName());
           infoVo.setCountry(film.getCountry());
           infoVo.setFilmId(film.getFilm_id());
           infoVo.setImgPath(film.getImg_path());
           infoVo.setLength(film.getLength());
           infoVo.setPlayer(film.getPlayer());
           infoVo.setDirector(film.getDirector());
           infoVo.setPlayTime(film.getPlay_time());
           infoVo.setType(film.getType());
           infoVo.setSynopsis(film.getSynopsis());
        return infoVo;
    }
}
