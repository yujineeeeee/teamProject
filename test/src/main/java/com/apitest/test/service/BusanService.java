package com.apitest.test.service;

import com.apitest.test.dto.busan.BusanItemDto;

import java.util.List;

public interface BusanService {
    List<BusanItemDto> getBusanList(String serviceUrl) throws Exception;
}
