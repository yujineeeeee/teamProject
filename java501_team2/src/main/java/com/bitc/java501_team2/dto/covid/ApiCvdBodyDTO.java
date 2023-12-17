package com.bitc.java501_team2.dto.covid;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "body")
public class ApiCvdBodyDTO {

    private int numOfRows;

    private int pageNo;

    private int totalCount;

    private ApiCvdItemsDTO items;

    @XmlElement(name = "numOfRows")
    public int getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    @XmlElement(name = "pageNo")
    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @XmlElement(name = "totalCount")
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @XmlElement(name = "items")
    public ApiCvdItemsDTO getItems() {
        return items;
    }

    public void setItems(ApiCvdItemsDTO items) {
        this.items = items;
    }
}
