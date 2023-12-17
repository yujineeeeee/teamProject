package com.bitc.java501_team2.dto.covid;

//import com.bitc.project.service.CvdApiResponseBody;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class CvdApiResponseDTO {
    private CvdApiResponseBodyDTO response;

    @XmlElement(name = "body")
    public CvdApiResponseBodyDTO getResponse() {
        return response;
    }

    public void setResponse(CvdApiResponseBodyDTO response) {
        this.response = response;
    }
}
