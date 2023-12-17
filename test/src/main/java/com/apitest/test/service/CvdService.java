package com.apitest.test.service;

import com.apitest.test.dto.cvd.ApiCvdItemDTO;

import java.util.List;

public interface CvdService {
    List<ApiCvdItemDTO> getCvdListFile(String serviceUrl) throws Exception;
}
