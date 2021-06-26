package com.juwuhe.service.impl;

import com.juwuhe.dao.PalyMapper;
import com.juwuhe.entity.Paly;
import com.juwuhe.service.PalyService;
import com.juwuhe.vo.PalyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PalyServiceimpl implements PalyService {

    @Autowired
    private PalyMapper palyMapper;

    @Override
    public List<PalyVO> getPalyByFilmID(String film_id) {
        List<Paly> palies = palyMapper.selectByFilmKey(film_id);
        ArrayList<PalyVO> palyVOS = new ArrayList<>();
        for (Paly paly : palies){
            PalyVO palyVO = new PalyVO();
            palyVO.setFilmId(paly.getFilmId());
            palyVO.setLanType(paly.getLanType());
            palyVO.setPlayId(paly.getPlayId());
            palyVO.setPlayTime(new Date(String.valueOf(paly.getPlayTime())));
            palyVO.setRoomName(paly.getRoomName());
            palyVO.setPrice(paly.getPrice());
            palyVO.setRoomId(paly.getRoomId());
            palyVO.setFilmName(paly.getFilmName());
            palyVOS.add(palyVO);
        }
        return palyVOS;
    }
}
