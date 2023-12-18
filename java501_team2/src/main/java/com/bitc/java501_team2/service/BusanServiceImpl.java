package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.busanTravel.BusanItemDto;
import com.bitc.java501_team2.dto.busanTravel.BusanResponseDto;
import jakarta.xml.bind.JAXBContext;
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
