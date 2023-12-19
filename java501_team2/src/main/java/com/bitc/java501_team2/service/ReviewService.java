package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReviewDto;
import com.github.pagehelper.Page;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> selectReviewList() throws Exception;

    Page<ReviewDto> selectBoardPageList(int pageNum) throws Exception;

    void deleteReview(String reviewNum) throws Exception;

    void insertReview(ReviewDto review) throws Exception;
}
