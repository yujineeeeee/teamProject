package com.apitest.test.controller;

import com.apitest.test.dto.boxOffice.DailyBoxOfficeListDTO;
import com.apitest.test.dto.busan.BusanItemDto;
import com.apitest.test.dto.cvd.ApiCvdItemDTO;
import com.apitest.test.service.BusanService;
import com.apitest.test.service.CvdService;
import com.apitest.test.service.ParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class apiController {

    @Autowired
    private ParserService parserService;

    @Autowired
    private CvdService cvdService;

    @Autowired
    private BusanService busanService;



    @Value("${fullstack501.kobis.service.url}")
    private String kobisServiceUrl;

    @Value("${fullstack501.kobis.service.key}")
    private String kobisServiceMyKey;

    @Value("${cvd.service.url}")
    private String cvdServiceUrl;

    @Value("${cvd.service.key}")
    private String cvdServiceKey;

    @GetMapping("/")
    public String index() throws Exception{
        return "html";
    }

    @GetMapping("/kobis/dailyBoxOffice")
    public String dailyBoxOffice() throws Exception{
        return "kobis/dailyBoxOffice";
    }

    @ResponseBody
    @PostMapping("/kobis/dailyBoxOfficeJson")
    public Object getDailyBoxOfficeJson(@RequestParam("targetDt") String targetDt) throws Exception{

        String optKey = "?key=";
        String opt1 = "&targetDt=";
        String serviceUrl = kobisServiceUrl + optKey + kobisServiceMyKey + opt1 + targetDt;

        List<DailyBoxOfficeListDTO> dailyBoxOfficeList = parserService.getDailyBoxOfficeJson(serviceUrl);

        return dailyBoxOfficeList;

    }

    @RequestMapping("/CVD")
    public ModelAndView getCvdUrl(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo, @RequestParam(value = "numOfRows",required = false,defaultValue = "10")int numOfRows)throws Exception{

        ModelAndView mv = new ModelAndView("Cvd");

        String optKey = "?serviceKey=";
        String opt1 = "&pageNo=";
        String opt2 = "&numOfRows=";
        String opt3 = "&apiType=";
        String opt4 = "&std_day=";//날짜 입력
//        String opt5 = "&gubun=%EA%B2%BD%EA%B8%B0"; 구분:ex)경기
        String serviceUrl = cvdServiceUrl + optKey + cvdServiceKey + opt1 + "1" + opt2 + "20" + opt3 + "xml"+opt4+"2023-01-01";

        List<ApiCvdItemDTO> cvdlist = cvdService.getCvdListFile(serviceUrl);
        mv.addObject("cvdlist", cvdlist);

        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "/CVDXml", method = RequestMethod.POST)
    public Object indexAjax(@RequestParam("targetDt")String targetDt) throws Exception {
        String optKey = "?serviceKey=";
        String opt1 = "&pageNo=";
        String opt2 = "&numOfRows=";
        String opt3 = "&apiType=";
        String opt4 = "&std_day=";
        String serviceUrl = cvdServiceUrl + optKey + cvdServiceKey + opt1 + "1" + opt2 + "20" + opt3 + "xml"+opt4 + targetDt;

        List<ApiCvdItemDTO> cvdlist = cvdService.getCvdListFile(serviceUrl);

        return cvdlist;
    }


    @RequestMapping("/busan")
    public ModelAndView getBusan() throws Exception{
        ModelAndView mv = new ModelAndView("busan");

        String optUrl = "http://apis.data.go.kr/6260000/RecommendedService/getRecommendedKr";
        String opt1 = "?serviceKey=";
        String optKey = "zE%2Fz90B7fPj8I0TSlZCp02kCZ1iB2wySd3ZyScEttrCLUPr2WwD8KYnRUFHGImTGAGpNWUSsi5Lb6GRROv6xxg%3D%3D";
        String opt2 = "&pageNo=";
        String opt3 = "&numOfRows=";

        String serviceUrl = optUrl + opt1 + optKey + opt2 + "1" + opt3 + "10";

        List<BusanItemDto> busanList = busanService.getBusanList(serviceUrl);
        mv.addObject("busanList", busanList);

        return mv;
    }

    @ResponseBody
    @PostMapping("/busanSearch")
    public Object busanSearch(@RequestParam("pageNum") String pageNum, @RequestParam("pageResult") String pageResult) throws Exception{
        String optUrl = "http://apis.data.go.kr/6260000/RecommendedService/getRecommendedKr";
        String opt1 = "?serviceKey=";
        String optKey = "zE%2Fz90B7fPj8I0TSlZCp02kCZ1iB2wySd3ZyScEttrCLUPr2WwD8KYnRUFHGImTGAGpNWUSsi5Lb6GRROv6xxg%3D%3D";
        String opt2 = "&pageNo=";
        String opt3 = "&numOfRows=";

        String serviceUrl = optUrl + opt1 + optKey + opt2 + pageNum + opt3 + pageResult;

        List<BusanItemDto> busanList = busanService.getBusanList(serviceUrl);

        return busanList;
    }


}
