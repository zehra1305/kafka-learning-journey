package com.example.day_9;

import java.math.BigDecimal;

public class KartDto {
    private String kartsahibiAdi;
    private String kartNo;
    private BigDecimal para;
    private Long timestamp;

    public KartDto() {}
    public KartDto(String kartsahibiAdi,String kartNo, BigDecimal para, Long timestamp) {
        this.kartsahibiAdi = kartsahibiAdi;
        this.kartNo = kartNo;
        this.para = para;
        this.timestamp = timestamp;
    }
    public String getKartsahibiAdi() {
        return kartsahibiAdi;
    }
    public void setKartsahibiAdi(String kartsahibiAdi) {
        this.kartsahibiAdi = kartsahibiAdi;
    }
    public String getKartNo() {
        return kartNo;
    }
    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }
    public BigDecimal getPara() {
        return para;
    }
    public void setPara(BigDecimal para) {
        this.para = para;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
