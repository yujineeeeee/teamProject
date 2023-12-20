package com.bitc.java501_team2.controller;

import com.bitc.java501_team2.dto.AccountDto;
import com.bitc.java501_team2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    //    회원가입
    @RequestMapping(value = "/account.do", method = RequestMethod.GET)
    public ModelAndView account() throws Exception{
//        ModelAndView : View 템플릿과 데이터인 Model을 동시에 가지고 있는 클래스
//        생성자로 View 템플릿의 위치를 지정
//        setView() 메소드를 통해서 설정한 View 템플릿을 변경할 수 있음
        ModelAndView mv = new ModelAndView("login/account");

        return mv;
    }

    //    회원가입
    @RequestMapping(value = "/account.do", method = RequestMethod.POST)
    public String accountProcess(AccountDto user) throws Exception{
        accountService.insertAccount(user);
        return "redirect:/main.do";
    }


    //중복확인
    @ResponseBody
    @PostMapping("/idCheck.do")
    public Object idCheck(@RequestParam("userId") String userId) throws Exception {

        int result = accountService.isIdCheck(userId);


        return result;
    }
}