package com.bitc.java501_team2.mapper;


import com.bitc.java501_team2.dto.ReviewDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
    List<ReviewDto> selectReviewList() throws Exception;

    void deleteReview(String reviewNum) throws Exception;

    void insertReview(ReviewDto review) throws Exception;
}
