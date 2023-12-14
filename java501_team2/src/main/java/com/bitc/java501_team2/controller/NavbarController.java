package com.bitc.java501_team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavbarController {
    //    ----------------------------------------------------------단순 홈페이지 연결-----------------------------------------------------------------------

    //    room201
    @GetMapping("/room201.do")
    public String room201() throws Exception {
        return "navbarPage/room201";
    }

    //    room202
    @GetMapping("/room202.do")
    public String room202() throws Exception {
        return "navbarPage/room202";
    }

    //    room401
    @GetMapping("/room401.do")
    public String room401() throws Exception {
        return "navbarPage/room401";
    }


    //    개별 수영장
    @GetMapping("privatePool.do")
    public String privatePool() throws Exception {
        return "navbarPage/privatePool";
    }

    //    자쿠지 & 히노끼
    @GetMapping("jacuzziHinoki.do")
    public String jacuzziHinoki() throws Exception {
        return "navbarPage/jacuzziHinoki";
    }

    //    포토존
    @GetMapping("photoZone.do")
    public String photoZone() throws Exception {
        return "navbarPage/photoZone";
    }
}
