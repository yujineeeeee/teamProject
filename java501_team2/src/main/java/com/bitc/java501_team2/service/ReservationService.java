package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReservationDto;

public interface ReservationService {

    public ReservationDto selectReservationList() throws Exception;

    public void insertReservation(ReservationDto reservation) throws Exception;


}
