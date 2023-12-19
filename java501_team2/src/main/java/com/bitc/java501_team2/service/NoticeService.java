package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.NoticeDto;
import com.github.pagehelper.Page;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

public interface NoticeService {

    List<NoticeDto> selectBoardList() throws Exception;

    Page<NoticeDto> selectBoardList(int page, String keyword) throws Exception;

    public NoticeDto selectBoardDetail(int noticeNum) throws Exception;

    public void NoticeInsertBoard(NoticeDto board) throws Exception;

    public void NoticeUpdateBoard(NoticeDto board) throws Exception;

    public void NoticeDeleteBoard(int noticeNum) throws Exception;


    // 검색
    List<NoticeDto> searchPosts(String keyword) throws Exception;
}
