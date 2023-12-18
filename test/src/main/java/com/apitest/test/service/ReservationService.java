package com.apitest.test.service;

import com.apitest.test.dto.ReservationDto;

public interface ReservationService {
    void insertReservation(ReservationDto reservation) throws Exception;
}
