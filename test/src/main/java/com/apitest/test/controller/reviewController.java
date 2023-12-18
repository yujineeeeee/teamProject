package com.apitest.test.controller;

import com.apitest.test.dto.ReviewDto;
import com.apitest.test.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class reviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviewList.do")
    public ModelAndView review() throws Exception{
        ModelAndView mv = new ModelAndView("review");

        List<ReviewDto> reviewList = reviewService.selectReviewList();
        mv.addObject("reviewList", reviewList);

        return mv;
    }

    @ResponseBody
    @PostMapping("/reviewDelete.do")
    public void deleteReview(@RequestParam("reviewNum") String reviewNum) throws Exception{
        reviewService.deleteReview(reviewNum);
    }

    @PostMapping("/insertReview.do")
    public String insertReview(ReviewDto review) throws Exception {
        reviewService.insertReview(review);

        return "redirect:/reviewList.do";
    }


}
