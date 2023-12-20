package com.bitc.java501_team2.controller;

import com.bitc.java501_team2.dto.busanTravel.BusanItemDto;
import com.bitc.java501_team2.dto.covid.ApiCvdItemDTO;
import com.bitc.java501_team2.service.BusanService;
import com.bitc.java501_team2.service.CvdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ApiController {
    @Autowired
    private CvdService cvdService;

    @Autowired
    private BusanService busanService;

    @Value("${cvd.service.url}")
    private String cvdServiceUrl;

    @Value("${cvd.service.key}")
    private String cvdServiceKey;

    @Value("${busan.service.url}")
    private String busanServiceUrl;

    @Value("${busan.service.key}")
    private String busanServiceKey;

    @RequestMapping("/popup/cvd")
    public ModelAndView getCvdUrl(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo, @RequestParam(value = "numOfRows",required = false,defaultValue = "10")int numOfRows)throws Exception{

        ModelAndView mv = new ModelAndView("popup/cvd");

        String optKey = "?serviceKey=";
        String opt1 = "&pageNo=";
        String opt2 = "&numOfRows=";
        String opt3 = "&apiType=";
        String opt4 = "&std_day=";

        String serviceUrl = cvdServiceUrl + optKey + cvdServiceKey + opt1 + "1" + opt2 + "20" + opt3 + "xml"+opt4+"2023-01-01";

        List<ApiCvdItemDTO> cvdlist = cvdService.getCvdListFile(serviceUrl);
        mv.addObject("cvdlist", cvdlist);

        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "/popup/cvdSearch", method = RequestMethod.POST)
    public Object indexAjax(@RequestParam("targetDt")String targetDt) throws Exception {
        String optKey = "?serviceKey=";
        String opt1 = "&pageNo=";
        String opt2 = "&numOfRows=";
        String opt3 = "&apiType=";
        String opt4 = "&std_day=";
        String serviceUrl = cvdServiceUrl + optKey + cvdServiceKey + opt1 + "1" + opt2 + "20" + opt3 + "xml" + opt4 + targetDt;

        List<ApiCvdItemDTO> cvdlist = cvdService.getCvdListFile(serviceUrl);

        return cvdlist;
    }


    @RequestMapping("/travel.do")
    public ModelAndView getBusan() throws Exception{
        ModelAndView mv = new ModelAndView("board/travel");

        String opt1 = "?serviceKey=";
        String opt2 = "&pageNo=";
        String opt3 = "&numOfRows=";

        String serviceUrl = busanServiceUrl + opt1 + busanServiceKey + opt2 + "1" + opt3 + "20";

        List<BusanItemDto> busanList = busanService.getBusanList(serviceUrl);
        mv.addObject("busanList", busanList);

        return mv;
    }

    @ResponseBody
    @PostMapping("/travelSearch.do")
    public Object busanSearch(@RequestParam("pageNum") String pageNum, @RequestParam("pageResult") String pageResult) throws Exception{

        String opt1 = "?serviceKey=";
        String opt2 = "&pageNo=";
        String opt3 = "&numOfRows=";

        String serviceUrl = busanServiceUrl + opt1 + busanServiceKey + opt2 + pageNum + opt3 + pageResult;

        List<BusanItemDto> busanList = busanService.getBusanList(serviceUrl);

        return busanList;
    }



}

