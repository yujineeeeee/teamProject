package com.apitest.test.service;

import com.apitest.test.dto.boxOffice.DailyBoxOfficeListDTO;

import java.util.List;

public interface ParserService {
    List<DailyBoxOfficeListDTO> getDailyBoxOfficeJson(String serviceUrl) throws Exception;
}
