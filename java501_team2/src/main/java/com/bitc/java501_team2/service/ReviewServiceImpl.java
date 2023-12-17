package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReviewDto;
import com.bitc.java501_team2.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;


    @Override
    public List<ReviewDto> selectReviewList() throws Exception {
        return (List<ReviewDto>) reviewMapper.selectReviewList();
    }

    @Override
    public void insertReview(ReviewDto review) throws Exception {
        reviewMapper.insertReview(review);
    }

    @Override
    public ReviewDto selectReviewDetail(int reviewNum) throws Exception {

        //reviewNum을 기준으로 review에 저장된 DB를 다 가져옴
        ReviewDto review = reviewMapper.selectReviewDetail(reviewNum);

        return review;
    }


}

