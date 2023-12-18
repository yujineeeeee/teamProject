package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationMapper reservationMapper;

    @Override
    public void insertReservation(ReservationDto reservation) throws Exception {
        reservationMapper.insertReservation(reservation);
    }

}
