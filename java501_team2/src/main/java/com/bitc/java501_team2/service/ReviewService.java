package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    public List<ReviewDto> selectReviewList() throws Exception;


    public void insertReview(ReviewDto review)throws Exception;

    ReviewDto selectReviewDetail(int reviewNum) throws Exception;



}
