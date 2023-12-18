package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.busanTravel.BusanItemDto;

import java.util.List;

public interface BusanService {
    List<BusanItemDto> getBusanList(String serviceUrl) throws Exception;
}
