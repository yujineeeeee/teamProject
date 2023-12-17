package com.bitc.java501_team2.service;


import com.bitc.java501_team2.dto.covid.ApiCvdItemDTO;

import java.util.List;

public interface CvdService {
    List<ApiCvdItemDTO> getCvdListFile(String serviceUrl) throws Exception;
}
