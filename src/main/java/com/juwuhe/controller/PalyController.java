package com.juwuhe.controller;

import com.juwuhe.service.impl.PalyServiceimpl;
import com.juwuhe.vo.PalyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PalyController {

    @Autowired
    private PalyServiceimpl palyServiceimpl;

    /**查询paly表记录*/
    @RequestMapping("/filmPalyInfo")
    @ResponseBody
    public List<PalyVO> findPaly (String filmid){
        List<PalyVO> palyVOS = palyServiceimpl.getPalyByFilmID(filmid);
        System.out.println(palyVOS);
        return palyVOS;
    }
}
