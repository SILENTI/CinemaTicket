package com.juwuhe.service.impl;

import com.juwuhe.dao.CinemaPlayMapper;
import com.juwuhe.dao.RoomMapper;
import com.juwuhe.entity.CinemaPlay;
import com.juwuhe.entity.Paly;
import com.juwuhe.entity.Room;
import com.juwuhe.service.PalyService;
import com.juwuhe.vo.PalyVO;
import com.juwuhe.vo.PlayDetaVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PalyServiceimpl implements PalyService {

    @Autowired
    private CinemaPlayMapper palyMapper;

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<PalyVO> getPalyByFilmID(String film_id) {
        List<CinemaPlay> palies = palyMapper.selectByFilmKey(film_id);
        ArrayList<PalyVO> palyVOS = new ArrayList<>();
        for (CinemaPlay paly : palies){
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

    @Override
    public PlayDetaVo getByPlayAndRoomById(String playid) {

        //先根据playid，查询到其相关信息
        Paly play = palyMapper.selectByPlayID(playid);
        PlayDetaVo playDetaVo = new PlayDetaVo();
        BeanUtils.copyProperties(play,playDetaVo);

        //处理数据库中的相关时间信息转化
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(play.getPlayTime());
        playDetaVo.setPlayTimeStr(dateStr);

        //根据roomid查询用户相关信息——>影厅的座位表信息
        Room room = roomMapper.selectByID(play.getRoomId());
        playDetaVo.setSeat(room.getSituation());
        return playDetaVo;
    }
}
