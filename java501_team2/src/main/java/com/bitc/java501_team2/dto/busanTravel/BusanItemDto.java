package com.bitc.java501_team2.dto.busanTravel;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class BusanItemDto {
    private String MAIN_TITLE;
    private String CATE2_NM;
    private String LNG;
    private String MIDDLE_SIZE_RM1;
    private String UC_SEQ;
    private String USAGE_AMOUNT;
    private String CNTCT_TEL;
    private String MAIN_IMG_NORMAL;
    private String TRFC_INFO;
    private String HLDY_INFO;
    private String ITEMCNTNTS;
    private String PLACE;
    private String SUBTITLE;
    private String USAGE_DAY;
    private String ADDR2;
    private String USAGE_DAY_WEEK_AND_TIME;
    private String GUGUN_NM;
    private String ADDR1;
    private String HOMEPAGE_URL;
    private String TITLE;
    private String MAIN_PLACE;
    private String MAIN_IMG_THUMB;
    private String LAT;

    @XmlElement(name = "MAIN_TITLE")
    public String getMAIN_TITLE() {
        return MAIN_TITLE;
    }

    public void setMAIN_TITLE(String MAIN_TITLE) {
        this.MAIN_TITLE = MAIN_TITLE;
    }

    @XmlElement(name = "CATE2_NM")
    public String getCATE2_NM() {
        return CATE2_NM;
    }

    public void setCATE2_NM(String CATE2_NM) {
        this.CATE2_NM = CATE2_NM;
    }

    @XmlElement(name = "LNG")
    public String getLNG() {
        return LNG;
    }

    public void setLNG(String LNG) {
        this.LNG = LNG;
    }

    @XmlElement(name = "MIDDLE_SIZE_RM1")
    public String getMIDDLE_SIZE_RM1() {
        return MIDDLE_SIZE_RM1;
    }

    public void setMIDDLE_SIZE_RM1(String MIDDLE_SIZE_RM1) {
        this.MIDDLE_SIZE_RM1 = MIDDLE_SIZE_RM1;
    }

    @XmlElement(name = "UC_SEQ")
    public String getUC_SEQ() {
        return UC_SEQ;
    }

    public void setUC_SEQ(String UC_SEQ) {
        this.UC_SEQ = UC_SEQ;
    }

    @XmlElement(name = "USAGE_AMOUNT")
    public String getUSAGE_AMOUNT() {
        return USAGE_AMOUNT;
    }

    public void setUSAGE_AMOUNT(String USAGE_AMOUNT) {
        this.USAGE_AMOUNT = USAGE_AMOUNT;
    }

    @XmlElement(name = "CNTCT_TEL")
    public String getCNTCT_TEL() {
        return CNTCT_TEL;
    }

    public void setCNTCT_TEL(String CNTCT_TEL) {
        this.CNTCT_TEL = CNTCT_TEL;
    }

    @XmlElement(name = "MAIN_IMG_NORMAL")
    public String getMAIN_IMG_NORMAL() {
        return MAIN_IMG_NORMAL;
    }

    public void setMAIN_IMG_NORMAL(String MAIN_IMG_NORMAL) {
        this.MAIN_IMG_NORMAL = MAIN_IMG_NORMAL;
    }

    @XmlElement(name = "TRFC_INFO")
    public String getTRFC_INFO() {
        return TRFC_INFO;
    }

    public void setTRFC_INFO(String TRFC_INFO) {
        this.TRFC_INFO = TRFC_INFO;
    }

    @XmlElement(name = "HLDY_INFO")
    public String getHLDY_INFO() {
        return HLDY_INFO;
    }

    public void setHLDY_INFO(String HLDY_INFO) {
        this.HLDY_INFO = HLDY_INFO;
    }

    @XmlElement(name = "ITEMCNTNTS")
    public String getITEMCNTNTS() {
        return ITEMCNTNTS;
    }

    public void setITEMCNTNTS(String ITEMCNTNTS) {
        this.ITEMCNTNTS = ITEMCNTNTS;
    }

    @XmlElement(name = "PLACE")
    public String getPLACE() {
        return PLACE;
    }

    public void setPLACE(String PLACE) {
        this.PLACE = PLACE;
    }

    @XmlElement(name = "SUBTITLE")
    public String getSUBTITLE() {
        return SUBTITLE;
    }

    public void setSUBTITLE(String SUBTITLE) {
        this.SUBTITLE = SUBTITLE;
    }

    @XmlElement(name = "USAGE_DAY")
    public String getUSAGE_DAY() {
        return USAGE_DAY;
    }

    public void setUSAGE_DAY(String USAGE_DAY) {
        this.USAGE_DAY = USAGE_DAY;
    }

    @XmlElement(name = "ADDR2")
    public String getADDR2() {
        return ADDR2;
    }

    public void setADDR2(String ADDR2) {
        this.ADDR2 = ADDR2;
    }

    @XmlElement(name = "USAGE_DAY_WEEK_AND_TIME")
    public String getUSAGE_DAY_WEEK_AND_TIME() {
        return USAGE_DAY_WEEK_AND_TIME;
    }

    public void setUSAGE_DAY_WEEK_AND_TIME(String USAGE_DAY_WEEK_AND_TIME) {
        this.USAGE_DAY_WEEK_AND_TIME = USAGE_DAY_WEEK_AND_TIME;
    }

    @XmlElement(name = "GUGUN_NM")
    public String getGUGUN_NM() {
        return GUGUN_NM;
    }

    public void setGUGUN_NM(String GUGUN_NM) {
        this.GUGUN_NM = GUGUN_NM;
    }

    @XmlElement(name = "ADDR1")
    public String getADDR1() {
        return ADDR1;
    }

    public void setADDR1(String ADDR1) {
        this.ADDR1 = ADDR1;
    }

    @XmlElement(name = "HOMEPAGE_URL")
    public String getHOMEPAGE_URL() {
        return HOMEPAGE_URL;
    }

    public void setHOMEPAGE_URL(String HOMEPAGE_URL) {
        this.HOMEPAGE_URL = HOMEPAGE_URL;
    }

    @XmlElement(name = "TITLE")
    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    @XmlElement(name = "MAIN_PLACE")
    public String getMAIN_PLACE() {
        return MAIN_PLACE;
    }

    public void setMAIN_PLACE(String MAIN_PLACE) {
        this.MAIN_PLACE = MAIN_PLACE;
    }

    @XmlElement(name = "MAIN_IMG_THUMB")
    public String getMAIN_IMG_THUMB() {
        return MAIN_IMG_THUMB;
    }

    public void setMAIN_IMG_THUMB(String MAIN_IMG_THUMB) {
        this.MAIN_IMG_THUMB = MAIN_IMG_THUMB;
    }

    @XmlElement(name = "LAT")
    public String getLAT() {
        return LAT;
    }

    public void setLAT(String LAT) {
        this.LAT = LAT;
    }
}
