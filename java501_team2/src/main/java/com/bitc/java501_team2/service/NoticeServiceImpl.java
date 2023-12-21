package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.NoticeDto;
import com.bitc.java501_team2.mapper.NoticeMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public Page<NoticeDto> selectBoardList(int page, String keyword) throws Exception {
        PageHelper.startPage(page, 10);
        if (keyword.equals("")) {
            return noticeMapper.selectBoardList();
        }
        else {
            return noticeMapper.selectBoardListKeyword(keyword);
        }
    }

    @Override
    public List<NoticeDto> selectBoardList() throws Exception {
        return noticeMapper.selectBoardList();
    }

    @Override
    public NoticeDto selectBoardDetail(int boardNum) throws Exception {
        noticeMapper.updateHitCount(boardNum);
        return noticeMapper.selectBoardDetail(boardNum);
    }


//     공지사항 글쓰기
    @Override
    public void NoticeInsertBoard(NoticeDto board) throws Exception {
        noticeMapper.NoticeInsertBoard(board);
    }


    //  공지사항 조회수

    
//     공지사항 글 수정
    @Override
    public void NoticeUpdateBoard(NoticeDto board) throws Exception {
        noticeMapper.NoticeUpdateBoard(board);
    }


//     공지사항  글 삭제
    @Override
    public void NoticeDeleteBoard(int boardNum) throws Exception {
        noticeMapper.NoticeDeleteBoard(boardNum);
    }


    @Override
    public List<NoticeDto> searchPosts(String keyword) throws Exception {
        return noticeMapper.selectBoardList();
    }


}
