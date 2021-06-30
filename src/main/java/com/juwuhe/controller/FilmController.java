package com.juwuhe.controller;

import com.juwuhe.service.FilmService;
import com.juwuhe.vo.FilmInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 居無何
* */

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService ;

    /**已上映的影片
    @RequestMapping("/FilmInfo")
    @ResponseBody
    public List<FilmVo> filmInfo(Model model){
        List<FilmVo> filmVos = filmService.selectFilm();
        model.addAttribute("filmVo",filmVos);
        return filmVos;
    }*/

    /**影片的详细信息*/
    @RequestMapping("/Films")
    public String Films (Model model) {
        model.addAttribute("filmVoList",filmService.selectFilm());
        return "Films";
    }

    /**单个影片的详细信息*/
    @RequestMapping("/filmInfo")
    public String filmInfo (@RequestParam("filmId") String filmid , Model model) {
        FilmInfoVo filmVo = filmService.selectFilmInfo(filmid);
        model.addAttribute("detailVo",filmVo);
        return "Detail";
    }


}
