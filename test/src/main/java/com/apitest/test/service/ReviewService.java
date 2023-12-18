package com.apitest.test.service;

import com.apitest.test.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> selectReviewList() throws Exception;

    void deleteReview(String reviewNum) throws Exception;

    void insertReview(ReviewDto review) throws Exception;
}
