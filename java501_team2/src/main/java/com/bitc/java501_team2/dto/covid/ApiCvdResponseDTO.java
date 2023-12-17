package com.bitc.java501_team2.dto.covid;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "response")
public class ApiCvdResponseDTO {
    private ApiCvdHeaderDTO header;
    private ApiCvdBodyDTO body;

    @XmlElement(name = "header")
    public ApiCvdHeaderDTO getHeader() {
        return header;
    }


    public void setHeader(ApiCvdHeaderDTO header) {
        this.header = header;
    }

    @XmlElement(name = "body")
    public ApiCvdBodyDTO getBody() {
        return body;
    }

    public void setBody(ApiCvdBodyDTO body) {
        this.body = body;
    }
}
