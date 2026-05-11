package com.example.day_7;

public class BiletDto {
    private String ad;
    private String biletno;
    private String kapi;
    private boolean isVip;

    public BiletDto() {}
    public BiletDto(String ad, String biletno,String kapi ,boolean isVip) {
        this.ad = ad;
        this.biletno = biletno;
        this.kapi=kapi;
        this.isVip=isVip;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getBiletno() {
        return biletno;
    }
    public void setBiletno(String biletno) {
        this.biletno = biletno;
    }
    public String getKapi() {
        return kapi;
    }
    public void setKapi(String kapi) {
        this.kapi = kapi;
    }
    public boolean getisVip() {
        return isVip;
    }
    public void setisVip(boolean isVip) {
        this.isVip = isVip;
    }
}
