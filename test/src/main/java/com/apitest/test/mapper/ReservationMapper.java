package com.apitest.test.mapper;

import com.apitest.test.dto.ReservationDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper {

    void insertReservation(ReservationDto reservation) throws Exception;
}
