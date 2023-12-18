package com.apitest.test.service;

import com.apitest.test.dto.ReservationDto;
import com.apitest.test.mapper.ReservationMapper;
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
