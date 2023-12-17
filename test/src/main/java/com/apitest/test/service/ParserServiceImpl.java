package com.apitest.test.service;

import com.apitest.test.dto.boxOffice.BoxOfficeDTO;
import com.apitest.test.dto.boxOffice.DailyBoxOfficeListDTO;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class ParserServiceImpl implements ParserService {
    @Override
    public List<DailyBoxOfficeListDTO> getDailyBoxOfficeJson(String serviceUrl) throws Exception{
        List<DailyBoxOfficeListDTO> itemList = null;

        URL url = null;
        HttpURLConnection urlConn = null;
        BufferedReader reader = null;

        try {
            url = new URL(serviceUrl);
            urlConn = (HttpURLConnection) url.openConnection();
            urlConn.setRequestMethod("GET");

            reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line;

            while((line = reader.readLine()) != null){
                sb.append(line);
            }

            Gson gson = new Gson();

            BoxOfficeDTO boxOffice = gson.fromJson(sb.toString(), BoxOfficeDTO.class);
            itemList = boxOffice.getBoxOfficeResult().getDailyBoxOfficeList();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(reader != null){ reader.close(); }
            if(urlConn != null){ urlConn.disconnect(); }
        }

        return itemList;
    }
}
