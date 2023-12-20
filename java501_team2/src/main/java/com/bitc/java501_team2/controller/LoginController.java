package com.bitc.java501_team2.controller;

import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.dto.UserDTO;
import com.bitc.java501_team2.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.net.URLEncoder;
import java.util.List;

//@RequestMapping("/login/")
@Controller
public class LoginController {

    @Autowired
    private UserService userService;


//    로그인 페이지
    @GetMapping("/login.do")
    public String login2() throws Exception{
        return "login/loginForm";
    }

//    로그인 프로세스
    @PostMapping("/login.do")
    public String loginProcess(@RequestParam("userId") String userId, @RequestParam("userPass") String userPass, HttpServletRequest req) throws Exception{
        int result = userService.isUserInfo(userId, userPass);

        if(result == 1){

            UserDTO user =  userService.getUserInfo(userId);

            HttpSession session = req.getSession();

            session.setAttribute("userId", user.getUserId());
            session.setAttribute("userName", user.getUserName());
            session.setAttribute("userRegidate", user.getUserRegidate());
            session.setAttribute("userCheck", user.getUserCheck());
//            session.setMaxInactiveInterval(60);

            return "redirect:/main.do";
        }
        else{
            String msg = URLEncoder.encode("로그인 정보가 다릅니다.", "UTF-8");
            return "redirect:/login.do?errorMsg=" + msg;
        }
    }

//    로그아웃 프로세스
    @GetMapping("/logout.do")
    public String logoutProcess(HttpServletRequest req) throws Exception{
        HttpSession session = req.getSession();

        session.removeAttribute("userId");
        session.removeAttribute("userName");
        session.removeAttribute("userRegidate");
        session.removeAttribute("userCheck");

        session.invalidate();

        return "redirect:/main.do";
    }

//    마이페이지
    @GetMapping("/myPage.do")
    public ModelAndView myPage(@RequestParam("userId") String userId, HttpServletRequest req) throws Exception{

        ModelAndView mv = new ModelAndView("login/myPage");

        UserDTO user = userService.getUserInfo(userId);
        List<ReservationDto> reservationList = userService.getReservationInfo(userId);

        mv.addObject("user", user);
        mv.addObject("reservationList", reservationList);

        return mv;
    }

//    예약 삭제
    @ResponseBody
    @PostMapping("/myReservationDelete.do")
    public void myReservationDelete(@RequestParam("reservationNum") String reservationNum) throws Exception{
        userService.myReservationDelete(reservationNum);
//        return null;
    }



//    관리자 페이지
    @GetMapping("/adminPage.do")
    public ModelAndView adminPage() throws Exception{
        ModelAndView mv = new ModelAndView("login/adminPage");

        List<UserDTO> userList = userService.getUserList();
        List<ReservationDto> userReservationList =  userService.userReservationList();

        mv.addObject("userList", userList);
        mv.addObject("userReservationList", userReservationList);

        return mv;
    }

//    회원 삭제시키기
    @ResponseBody
    @PostMapping("/userDelete.do")
    public void userDelete(@RequestParam("selUserId") String selUserId) throws Exception{
        userService.userDelete(selUserId);
    }




}
