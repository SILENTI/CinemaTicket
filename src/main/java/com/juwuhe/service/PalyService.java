package com.juwuhe.service;

import com.juwuhe.vo.PalyVO;
import com.juwuhe.vo.PlayDetaVo;

import java.util.List;

public interface PalyService {

    List<PalyVO> getPalyByFilmID (String film_id);

     PlayDetaVo getByPlayAndRoomById(String playid);
    
}
