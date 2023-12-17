package com.apitest.test.dto.cvd;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "body")
public class CvdApiResponseBody {
    private List<ApiCvdItemDTO> items;

    @XmlElement(name = "items")
    public List<ApiCvdItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ApiCvdItemDTO> items) {
        this.items = items;
    }
}
