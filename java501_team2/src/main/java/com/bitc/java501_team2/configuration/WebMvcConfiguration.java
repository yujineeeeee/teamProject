package com.bitc.java501_team2.configuration;

import com.bitc.java501_team2.interceptor.LoginCheck;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration : 해당 클래스가 Spring Framework의 설정 파일임을 알려줌
// WebMvcConfigurer : 스프링 프레임워크의 웹 설정 정보를 가지고 있는 인터페이스
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

//  사용자 인터셉터를 추가
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
//    addInterceptor() : 사용자가 생성한 인터셉터 클래스 객체를 등록
    registry.addInterceptor(new LoginCheck())
//        addPathPatterns() : 인터셉터를 동작시킬 주소 패턴 등록
        .addPathPatterns("/reservation.do")
        .addPathPatterns("/reviewWrite.do")
//        excludePathPatterns() : 인터셉터에서 제외할 주소 패턴 등록
        .excludePathPatterns("/main.do")
        .excludePathPatterns("/location.do")
        .excludePathPatterns("/travel.do")
        .excludePathPatterns("/reviewList.do")
        .excludePathPatterns("/room201.do")
        .excludePathPatterns("/room202.do")
        .excludePathPatterns("/room401.do")
        .excludePathPatterns("/privatePool.do")
        .excludePathPatterns("/jacuzziHinoki.do")
        .excludePathPatterns("/photoZone.do")
        .excludePathPatterns("/login.do")
        .excludePathPatterns("/not.do");
  }
}







