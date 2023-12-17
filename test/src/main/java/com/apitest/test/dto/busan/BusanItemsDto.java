package com.apitest.test.dto.busan;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "items")
public class BusanItemsDto {
    private List<BusanItemDto> item;

    @XmlElement(name = "item")
    public List<BusanItemDto> getItem() {
        return item;
    }

    public void setItem(List<BusanItemDto> item) {
        this.item = item;
    }
}
