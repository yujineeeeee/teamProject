package com.bitc.java501_team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @RequestMapping("/")
    public String index() throws Exception {
        return "index";
    }


//    메인 페이지
    @GetMapping("/main.do")
    public String main() throws Exception{
        return "board/main";
    }

}
