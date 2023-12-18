package com.bitc.java501_team2.dto.busanTravel;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "header")
public class BusanHeaderDto {
    private String resultCode;
    private String resultMsg;

    @XmlElement(name = "resultCode")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlElement(name = "resultMsg")
    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
