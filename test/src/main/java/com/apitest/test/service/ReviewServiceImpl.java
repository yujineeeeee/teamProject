package com.apitest.test.service;

import com.apitest.test.dto.ReviewDto;
import com.apitest.test.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;


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
