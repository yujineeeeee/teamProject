package com.bitc.java501_team2.mapper;


import com.bitc.java501_team2.dto.ReservationDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper {
   void insertReservation(ReservationDto reservation) throws Exception;
}
