package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
//    데이터 베이스를 사용하기 위한 Mapper 인터페이스
    private ReservationMapper reservationMapper;


    @Override
    public ReservationDto selectReservationList() throws Exception {
        return reservationMapper.selectReservationList();
    }

    @Override
    public void insertReservation(ReservationDto reservation) throws Exception {
        //    mapper를 사용하여 데이터 베이스에 글 등록
        reservationMapper.insertReservation(reservation);
    }

}
