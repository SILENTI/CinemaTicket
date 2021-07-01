package com.juwuhe.controller;

import com.juwuhe.service.PalyService;
import com.juwuhe.vo.PalyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PalyController {

    @Autowired
    private PalyService palyService;

    @RequestMapping(value = {"/Play"},method = RequestMethod.GET)
    public String playInfo (String filmid, Model model){
        List<PalyVO> palyVOs = palyService.getPalyByFilmID(filmid);
        model.addAttribute("playVos",palyVOs);
        return "Play";
    }
}
