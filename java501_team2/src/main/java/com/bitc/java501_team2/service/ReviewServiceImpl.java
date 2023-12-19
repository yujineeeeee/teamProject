package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReviewDto;
import com.bitc.java501_team2.mapper.ReviewMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;


    @Override
    public Page<ReviewDto> selectBoardPageList(int pageNum) throws Exception {
        PageHelper.startPage(pageNum, 10);
        return reviewMapper.selectBoardPageList();
    }

    @Override
    public List<ReviewDto> selectReviewList() throws Exception {
        return reviewMapper.selectReviewList();
    }

    @Override
    public void deleteReview(String reviewNum) throws Exception {
        reviewMapper.deleteReview(reviewNum);
    }

    @Override
    public void insertReview(ReviewDto review) throws Exception {
        reviewMapper.insertReview(review);
    }


}

