package com.bitc.java501_team2.dto.covid;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "items")
public class ApiCvdItemsDTO {
    private List<ApiCvdItemDTO> item;

    @XmlElement(name = "item")
    public List<ApiCvdItemDTO> getItem() {
        return item;
    }

    public void setItem(List<ApiCvdItemDTO> item) {
        this.item = item;
    }
}
