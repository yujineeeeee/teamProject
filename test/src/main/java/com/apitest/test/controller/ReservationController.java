package com.apitest.test.controller;

import com.apitest.test.dto.ReservationDto;
import com.apitest.test.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/reservation.do")
    public String reservation() throws Exception{
        return "reservation";
    }

    @PostMapping("/insertReservation.do")
    public String insertReservation(ReservationDto reservation) throws Exception{
        reservationService.insertReservation(reservation);

        return "redirect:/reservation.do";
    }
}
