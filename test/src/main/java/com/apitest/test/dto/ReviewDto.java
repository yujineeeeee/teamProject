package com.apitest.test.dto;


import lombok.Data;

@Data
public class ReviewDto {
    public int reviewNum;
    public String reviewContent;
    public String reviewId;
    public String reviewStar;
    public String reviewPostdate;
    public String reviewUpdateDate;
    public String reviewDeletedYn;
}
