package com.bitc.java501_team2.dto;


import lombok.Data;

@Data
public class ReservationDto {
    private String reservationId;
    private String reservationName;
    private String reservationDate;
    private String reservationRoomType1;
    private String reservationRoomType2;
    private String reservationRoomType3;
    private String reservationPersonCnt;
    private String checkInDate;
    private String checkOutDate;
    private String reservationDeletedYn;
}
