package com.apitest.test.dto.cvd;

//import com.bitc.project.service.CvdApiResponseBody;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class CvdApiResponse {
    private CvdApiResponseBody response;

    @XmlElement(name = "body")
    public CvdApiResponseBody getResponse() {
        return response;
    }

    public void setResponse(CvdApiResponseBody response) {
        this.response = response;
    }
}
