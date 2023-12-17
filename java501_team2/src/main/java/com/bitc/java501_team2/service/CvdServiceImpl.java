package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.covid.ApiCvdItemDTO;
import com.bitc.java501_team2.dto.covid.ApiCvdResponseDTO;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class CvdServiceImpl implements CvdService {
    @Override
    public List<ApiCvdItemDTO> getCvdListFile(String serviceUrl) throws Exception {
        List<ApiCvdItemDTO> itemList = null;
        URL url = null;
        HttpURLConnection urlConn = null;

        try {
            url = new URL(serviceUrl);
            urlConn = (HttpURLConnection) url.openConnection();
            urlConn.setRequestMethod("GET");

            JAXBContext jc = JAXBContext.newInstance(ApiCvdResponseDTO.class);
            Unmarshaller um = jc.createUnmarshaller();

            ApiCvdResponseDTO fullData = (ApiCvdResponseDTO) um.unmarshal(url);
            itemList = fullData.getBody().getItems().getItem();

        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (urlConn != null) { urlConn.disconnect(); }
        }
        return itemList;
    }
}
