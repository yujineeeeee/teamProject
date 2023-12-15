package com.bitc.java501_team2.dto;

import lombok.Data;

@Data
public class NoticeDto {
    private int noticeNum;
    private String noticeTitle;
    private String noticeContent;
    private String noticeId;
    private String noticePostdate;
    private String noticeUpdateDate;
    private String noticeVisitcount;
    private String noticeDeletedYn;

}
