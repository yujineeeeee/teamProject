package com.bitc.java501_team2.mapper;


import com.bitc.java501_team2.dto.ReviewDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {

    public List<ReviewDto> selectReviewList() throws Exception;

    public void insertReview(ReviewDto review)throws Exception;

    ReviewDto selectReviewDetail(int reviewNum) throws Exception;
}
