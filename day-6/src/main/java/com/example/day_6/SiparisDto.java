package com.example.day_6;

import java.math.BigDecimal;

public class SiparisDto {
    private String musteriAdi;
    private String urunAdi;
    private BigDecimal fiyat;
    private boolean gonderildimi;

    public SiparisDto() {}
    public SiparisDto(String musteriAdi, String urunAdi, BigDecimal fiyat, boolean gonderildimi) {
        this.musteriAdi = musteriAdi;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.gonderildimi = gonderildimi;
    }
    public String getMusteriAdi() {
        return musteriAdi;
    }
    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }
    public String getUrunAdi() {
        return urunAdi;
    }
    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    public BigDecimal getFiyat() {
        return fiyat;
    }
    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }
    public boolean isGonderildimi() {
        return gonderildimi;
    }
    public void setGonderildimi(boolean gonderildimi) {
        this.gonderildimi = gonderildimi;
    }
}
