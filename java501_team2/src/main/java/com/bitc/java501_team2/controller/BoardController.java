package com.bitc.java501_team2.controller;

import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

    @Autowired
    ReservationService reservationService;

    @RequestMapping("/")
    public String index() throws Exception {
        return "index";
    }


    //    메인 페이지
    @GetMapping("/main.do")
    public String main() throws Exception {
        return "board/main";
    }


    //    예약 페이지
    @GetMapping(value = "/reservation.do")
    public String reservation() throws Exception {
        return "board/reservation";
    }

    @PostMapping(value = "/reservation.do")
    public ModelAndView reservationProcess() throws Exception {
        ModelAndView mv = new ModelAndView("board/reservation");

        ReservationDto board = reservationService.selectReservationList();

        mv.addObject("board", board);

        return mv;
    }


    @GetMapping("/board/insertReservation.do")
    public String insertReservation(ReservationDto reservation) throws Exception {
        reservationService.insertReservation(reservation);

        return "redirect:/reservation.do";
    }


    //    오시는 길
    @GetMapping("/board/location.do")
    public String location() throws Exception {
        return "board/location";
    }

}
