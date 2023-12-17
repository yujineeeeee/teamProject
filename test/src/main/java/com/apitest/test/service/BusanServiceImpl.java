package com.apitest.test.service;

import com.apitest.test.dto.busan.BusanItemDto;
import com.apitest.test.dto.busan.BusanResponseDto;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class BusanServiceImpl implements BusanService{
    @Override
    public List<BusanItemDto> getBusanList(String serviceUrl) throws Exception {
        List<BusanItemDto> itemList = null;
        URL url = null;
        HttpURLConnection urlConn = null;

        try {
            url = new URL(serviceUrl);
            urlConn = (HttpURLConnection) url.openConnection();
            urlConn.setRequestMethod("GET");

            JAXBContext jc = JAXBContext.newInstance(BusanResponseDto.class);
            Unmarshaller um = jc.createUnmarshaller();

            BusanResponseDto fullData = (BusanResponseDto) um.unmarshal(url);
            itemList = fullData.getBody().getItems().getItem();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(urlConn != null) { urlConn.disconnect(); }
        }

        return itemList;
    }
}
