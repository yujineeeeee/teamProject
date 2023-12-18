package com.bitc.java501_team2.dto.busanTravel;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "body")
public class BusanBodyDto {
    private BusanItemsDto items;
    private String numOfRows;
    private String pageNo;
    private String totalCount;

    @XmlElement(name = "items")
    public BusanItemsDto getItems() {
        return items;
    }

    public void setItems(BusanItemsDto items) {
        this.items = items;
    }

    @XmlElement(name = "numOfRows")
    public String getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(String numOfRows) {
        this.numOfRows = numOfRows;
    }

    @XmlElement(name = "pageNo")
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    @XmlElement(name = "totalCount")
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
}
