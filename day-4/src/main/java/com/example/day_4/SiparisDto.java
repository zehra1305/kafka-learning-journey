package com.example.day_4;

public class SiparisDto {
    private String yemekAdi;
    private String musteriAdresi;
    private double para;
    private int siparisId;

    public SiparisDto(){

    }
    public SiparisDto(String yemekAdi, String musteriAdresi, double para, int siparisId) {
        this.yemekAdi = yemekAdi;
        this.musteriAdresi = musteriAdresi;
        this.para = para;
        this.siparisId = siparisId;
    }
    public String getYemekAdi() {
        return yemekAdi;
    }
    public void setYemekAdi(String yemekAdi) {
        this.yemekAdi = yemekAdi;
    }
    public String getmusteriAdresi() {
        return musteriAdresi;
    }
    public void setmusteriAdresi(String MusteriAdresi) {
        musteriAdresi = MusteriAdresi;
    }
    public double getPara() {
        return para;
    }
    public void setPara(double para) {
        this.para = para;
    }
    public int getSiparisId() {
        return siparisId;
    }
    public void setSiparisId(int siparisId) {
        this.siparisId = siparisId;
    }

}
