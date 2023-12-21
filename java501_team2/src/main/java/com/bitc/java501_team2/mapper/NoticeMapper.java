package com.bitc.java501_team2.mapper;

import com.bitc.java501_team2.dto.NoticeDto;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NoticeMapper {

    Page<NoticeDto> selectBoardList() throws Exception;

    Page<NoticeDto> selectBoardListKeyword(@Param("keyword")String keyword) throws Exception;

    NoticeDto selectBoardDetail(int noticeNum) throws Exception;

    void NoticeInsertBoard(NoticeDto board) throws Exception;

    void updateHitCount(@Param("noticeNum") int noticeNum) throws Exception;

    void NoticeUpdateBoard(NoticeDto board) throws Exception;

    void NoticeDeleteBoard(@Param("noticeNum") int noticeNum) throws Exception;
}
