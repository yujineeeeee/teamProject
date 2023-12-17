package com.apitest.test.dto.boxOffice;

import lombok.Data;

import java.util.List;

@Data
public class BoxOfficeResultDTO {
    private String boxofficeType;
    private String showRange;
    private List<DailyBoxOfficeListDTO> dailyBoxOfficeList;
}
