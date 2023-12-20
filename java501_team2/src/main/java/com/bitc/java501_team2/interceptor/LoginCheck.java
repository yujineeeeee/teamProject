package com.bitc.java501_team2.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.PrintWriter;

public class LoginCheck implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception{

        HttpSession session = req.getSession();

        System.out.println("\n -----------interceptor 동작 ----------------\n");

        String userId = (String) session.getAttribute("userId");
        System.out.println("USER ID : " + userId);

        if(userId == null || userId.equals("")){
            System.out.println("************* interceptor **************");
            System.out.println("비 로그인 상태");
            System.out.println("USER ID :" + (String) session.getAttribute("userId"));

            res.setContentType("text/html; charset=UTF-8");
            PrintWriter out = res.getWriter();
            out.println("<script>alert('로그인이 필요합니다.'); history.back();</script>");
//            out.println("<script>alert('로그인이 필요합니다.'); location.href = '/login.do';</script>");

            out.flush();
            res.flushBuffer();
            out.close();
            return false;
        }
        else{
            System.out.println("************* interceptor **************");
            System.out.println("로그인 상태");
            System.out.println("USER ID :" + (String) session.getAttribute("userId"));

            session.setMaxInactiveInterval(60 * 10);
            return true;
        }
    }
}
