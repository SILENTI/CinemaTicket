package com.juwuhe.controller;

import com.juwuhe.service.impl.FilmServiceimpl;
import com.juwuhe.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 居無何
* */

@Controller
public class FilmController {

    @Autowired
    private FilmServiceimpl filmServiceimpl ;

    @RequestMapping("/FilmInfo")
    @ResponseBody
    public List<FilmVo> filmInfo(){
        return filmServiceimpl.selectfilm();
    }
}
