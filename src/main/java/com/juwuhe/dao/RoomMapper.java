package com.juwuhe.dao;

import com.juwuhe.entity.Paly;
import com.juwuhe.entity.Room;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface RoomMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("roomId") String roomId);

    int insert(Room record);

    Room selectByPrimaryKey(@Param("id") Integer id, @Param("roomId") String roomId);

    List<Room> selectAll();

    int updateByPrimaryKey(Room record);

}