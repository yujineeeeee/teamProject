package com.bitc.java501_team2.dto.covid;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class ApiCvdItemDTO {
    private String deathCnt;
    private String defCnt;
    private String gubun;
    private String gubunCn;
    private String gubunEn;
    private String incDec;
    private String isolClearCnt;
    private String isolIngCnt;
    private String localOccCnt;
    private String overFlowCnt;
    private String qurRate;
    private String stdDay;


    @XmlElement(name = "deathCnt")
    public String getDeathCnt() {
        return deathCnt;
    }

    public void setDeathCnt(String deathCnt) {
        this.deathCnt = deathCnt;
    }

    @XmlElement(name = "defCnt")
    public String getDefCnt() {
        return defCnt;
    }

    public void setDefCnt(String defCnt) {
        this.defCnt = defCnt;
    }

    @XmlElement(name = "gubun")
    public String getGubun() {
        return gubun;
    }

    public void setGubun(String gubun) {
        this.gubun = gubun;
    }

    @XmlElement(name = "gubunCn")
    public String getGubunCn() {
        return gubunCn;
    }

    public void setGubunCn(String gubunCn) {
        this.gubunCn = gubunCn;
    }

    @XmlElement(name = "gubunEn")
    public String getGubunEn() {
        return gubunEn;
    }

    public void setGubunEn(String gubunEn) {
        this.gubunEn = gubunEn;
    }

    @XmlElement(name = "incDec")
    public String getIncDec() {
        return incDec;
    }

    public void setIncDec(String incDec) {
        this.incDec = incDec;
    }

    @XmlElement(name = "isolClearCnt")
    public String getIsolClearCnt() {
        return isolClearCnt;
    }

    public void setIsolClearCnt(String isolClearCnt) {
        this.isolClearCnt = isolClearCnt;
    }

    @XmlElement(name = "isolIngCnt")
    public String getIsolIngCnt() {
        return isolIngCnt;
    }

    public void setIsolIngCnt(String isolIngCnt) {
        this.isolIngCnt = isolIngCnt;
    }

    @XmlElement(name = "localOccCnt")
    public String getLocalOccCnt() {
        return localOccCnt;
    }

    public void setLocalOccCnt(String localOccCnt) {
        this.localOccCnt = localOccCnt;
    }

    @XmlElement(name = "overFlowCnt")
    public String getOverFlowCnt() {
        return overFlowCnt;
    }

    public void setOverFlowCnt(String overFlowCnt) {
        this.overFlowCnt = overFlowCnt;
    }

    @XmlElement(name = "qurRate")
    public String getQurRate() {
        return qurRate;
    }

    public void setQurRate(String qurRate) {
        this.qurRate = qurRate;
    }

    @XmlElement(name = "stdDay")
    public String getStdDay() {
        return stdDay;
    }

    public void setStdDay(String stdDay) {
        this.stdDay = stdDay;
    }
}
