package com.bitc.java501_team2.dto;


import lombok.Data;

@Data
public class ReservationDto {
    private String reservationNum;
    private String reservationId;
    private String reservationName;
    private String reservationDate;
    private String reservationRoomType1;
    private String reservationRoomType2;
    private String reservationRoomType3;
    private String checkInDate;
    private String checkOutDate;
    private String reservationDeletedYn;
    private String roomType1PersonCnt;
    private String roomType2PersonCnt;
    private String roomType3PersonCnt;
}
