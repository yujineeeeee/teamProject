package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> selectReviewList() throws Exception;

    void deleteReview(String reviewNum) throws Exception;

    void insertReview(ReviewDto review) throws Exception;
}
