package com.bitc.java501_team2.dto.busanTravel;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class BusanResponseDto {

    private BusanHeaderDto header;
    private BusanBodyDto body;

    @XmlElement(name = "header")
    public BusanHeaderDto getHeader() {
        return header;
    }

    public void setHeader(BusanHeaderDto header) {
        this.header = header;
    }

    @XmlElement(name = "body")
    public BusanBodyDto getBody() {
        return body;
    }

    public void setBody(BusanBodyDto body) {
        this.body = body;
    }
}
