package com.bitc.java501_team2.mapper;

import com.bitc.java501_team2.dto.NoticeDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NoticeMapper {
    List<NoticeDto> selectBoardList() throws Exception;

    NoticeDto selectBoardDetail(int noticeNum) throws Exception;

    void NoticeInsertBoard(NoticeDto board) throws Exception;

     void updateHitCount(@Param("noticeNum") int noticeNum) throws Exception;


    void NoticeUpdateBoard(NoticeDto board) throws Exception;

    void NoticeDeleteBoard(@Param("noticeNum") int noticeNum) throws Exception;


}
