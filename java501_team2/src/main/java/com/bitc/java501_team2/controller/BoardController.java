package com.bitc.java501_team2.controller;

import com.bitc.java501_team2.dto.NoticeDto;
import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.dto.ReviewDto;
import com.bitc.java501_team2.service.NoticeService;
import com.bitc.java501_team2.service.ReservationService;
import com.bitc.java501_team2.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    ReservationService reservationService;

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private ReviewService reviewService;



    @RequestMapping("/")
    public String index() throws Exception {
        return "index";
    }


    //    메인 페이지
    @GetMapping("/main.do")
    public String main() throws Exception {
        return "board/main";
    }


    //    오시는 길
    @GetMapping("/location.do")
    public String location2() throws Exception {
        return "board/location";
    }

    //    ------------------------------------------- 예약하기 ---------------------------------------------------------

    //    예약 페이지
    @RequestMapping(value = "/reservation.do", method = RequestMethod.GET)
    public String reservation() throws Exception {
        return "board/reservation";
    }

    @RequestMapping(value = "/reservation.do", method = RequestMethod.POST)
    public ModelAndView reservationProcess() throws Exception {
        ModelAndView mv = new ModelAndView("board/reservation");

        ReservationDto board = reservationService.selectReservationList();
        mv.addObject("board", board);

        return mv;
    }

    @RequestMapping("/board/insertReservation.do")
    public String insertReservation(ReservationDto reservation) throws Exception {
        reservationService.insertReservation(reservation);

//        지정한 주소로 리다이렉트
        return "redirect:/reservation.do";
    }

//    ------------------------------------------- 공지사항 ---------------------------------------------------------

    //    공지사항
    @RequestMapping(value = "/not.do", method = RequestMethod.GET)
    public ModelAndView boardList() throws Exception {
        ModelAndView mv = new ModelAndView("board/notice/boardList");

        List<NoticeDto> boardList = noticeService.selectBoardList();
        mv.addObject("boardList", boardList);

        return mv;
    }

    //   공지사항 글쓰기 뷰 페이지
    @RequestMapping("/notWrite.do")
    public String boardWrite() throws Exception {
        return "board/notice/boardWrite";
    }

    //     공지사항 글쓰기
    @RequestMapping("/notInsertBoard.do")
    public String insertBoard(NoticeDto board, MultipartHttpServletRequest multipart) throws Exception {

        noticeService.NoticeInsertBoard(board, multipart);
//        지정한 주소로 리다이렉트
        return "redirect:/not.do";
    }

    //         공지사항 상세보기
    @RequestMapping("/notDetail.do/{noticeNum}")
    public ModelAndView boardDetail(@PathVariable("noticeNum") int noticeNum) throws Exception {
        ModelAndView mv = new ModelAndView("board/notice/boardDetail");
        System.out.println(noticeNum);


        NoticeDto board = noticeService.selectBoardDetail(noticeNum);
        mv.addObject("board", board);

        return mv;
    }

    //     공지사항 수정
    @RequestMapping(value = "/notUpdate.do")
    public String updateBoard(NoticeDto board) throws Exception {
//        service를 사용하여 사용하여 사용자가 입력한 데이터로 변경
        noticeService.NoticeUpdateBoard(board);
        return "redirect:/not.do";
//        return "redirect:/board/boardDetail.do?boardIdx=" + board.getBoardIdx();
    }

    //    공지사항 삭제하기
    @RequestMapping("/notDeleteBoard.do")
    public String deleteBoard(@RequestParam("noticeNum") int noticeNum) throws Exception {
//        Service를 사용하여 데이터 베이스의 내용 삭제
        noticeService.NoticeDeleteBoard(noticeNum);
        return "redirect:/not.do";
    }

    //    ------------------------------------------- 리뷰 ---------------------------------------------------------
    @RequestMapping(value = "/reviewList.do", method = RequestMethod.GET)
    public ModelAndView selectReviewList() throws Exception {

        ModelAndView mv = new ModelAndView("board/reviewList");

        List<ReviewDto> reviewList = (List<ReviewDto>) reviewService.selectReviewList();
        mv.addObject("reviewList", reviewList);

        return mv;
    }

    @RequestMapping(value = "/reviewList.do", method = RequestMethod.POST)
    public String ReviewProcess(ReviewDto review) throws Exception {
        reviewService.insertReview(review);

        return "redirect:/main.do";
    }

    @RequestMapping("/board/insertReview.do")
    public String insertReview(ReviewDto review) throws Exception {
        reviewService.insertReview(review);

        return "redirect:/reviewList.do";
    }


//    ----------------------테스트
    @GetMapping("/popupTest")
    public String popupTest() throws  Exception{
        return "popup/popupTest";
    }

    @GetMapping("/popup")
    public String popup() throws  Exception{
        return "popup/popup";
    }


}
