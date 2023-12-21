package com.bitc.java501_team2.controller;

import com.bitc.java501_team2.dto.NoticeDto;
import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.dto.ReviewDto;
import com.bitc.java501_team2.service.NoticeService;
import com.bitc.java501_team2.service.ReservationService;
import com.bitc.java501_team2.service.ReviewService;
import com.github.pagehelper.PageInfo;
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

    @GetMapping("/reservation.do")
    public String reservation() throws Exception{
        return "board/reservation";
    }

    @PostMapping("/insertReservation.do")
    public String insertReservation(ReservationDto reservation) throws Exception{
        reservationService.insertReservation(reservation);

        return "redirect:/reservation.do";
    }

//    예약 가이드
    @GetMapping("/reservationGuide")
    public String reservationGuide() throws Exception{
        return "board/reservationGuide";
    }


//    ------------------------------------------- 공지사항 ---------------------------------------------------------

    //    공지사항
    @RequestMapping(value = "/not.do", method = RequestMethod.GET)
    public ModelAndView boardList(@RequestParam(value = "page", required = false, defaultValue = "1") int page,@RequestParam(required = false, defaultValue = "", value = "keyword")String keyword) throws Exception {
        ModelAndView mv = new ModelAndView("board/notice/boardList");


        PageInfo<NoticeDto> boardList = new PageInfo<>(noticeService.selectBoardList(page, keyword),5);
        mv.addObject("boardList", boardList);
        mv.addObject("keyword", keyword);

        return mv;
    }


    //   공지사항 글쓰기 뷰 페이지
    @RequestMapping("/notWrite.do")
    public String boardWrite() throws Exception {
        return "board/notice/boardWrite";
    }


    //     공지사항 글쓰기
    @PostMapping("/notInsertBoard.do")
    public String insertBoard(NoticeDto board) throws Exception {

        noticeService.NoticeInsertBoard(board);
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
    @PostMapping("/notDeleteBoard.do")
    public String deleteBoard(@RequestParam("noticeNum") int noticeNum) throws Exception {
        noticeService.NoticeDeleteBoard(noticeNum);
        return "redirect:/not.do";
    }

    //    ------------------------------------------- 리뷰 ---------------------------------------------------------

    //    리뷰 목록
    @GetMapping("/reviewList.do")
    public ModelAndView selectBoardPagingList(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum) throws Exception {
        ModelAndView mv = new ModelAndView("board/reviewList");

        PageInfo<ReviewDto> boardPageList = new PageInfo<>(reviewService.selectBoardPageList(pageNum), 5);
        mv.addObject("boardPageList", boardPageList);

        return mv;
    }

    @GetMapping("/reviewWrite.do")
    public String reviewWrite() throws Exception{
        return "board/reviewWrite";
    }

    //    리뷰 삭제
    @ResponseBody
    @PostMapping("/reviewDelete.do")
    public void deleteReview(@RequestParam("reviewNum") String reviewNum) throws Exception {
        reviewService.deleteReview(reviewNum);
    }

    // 리뷰 등록
    @PostMapping("/insertReview.do")
    public String insertReview(ReviewDto review) throws Exception {
        reviewService.insertReview(review);

        return "redirect:/reviewList.do";
    }
}
