package com.juwuhe.service.impl;

import com.juwuhe.dao.FilmDao;
import com.juwuhe.entity.Film;
import com.juwuhe.service.FilmService;
import com.juwuhe.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceimpl implements FilmService {

    @Autowired
    private FilmDao filmDao;

    @Override
    public List<FilmVo> selectfilm() {
        List<Film> films = filmDao.selectFilmInfo();
        ArrayList<FilmVo> filmVos = new ArrayList<>();
        for (Film film : films){
            FilmVo filmVo = new FilmVo();
            filmVo.setName(film.getName());
            filmVo.setDirector(film.getDirector());
            filmVo.setImgPath(film.getImg_path());
            filmVos.add(filmVo);
        }
        return filmVos;
    }
}
