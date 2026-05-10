package com.example.day_5;

import java.math.BigDecimal;

public class MusteriDto {
    private String musteriAdi;
    private String kartno;
    private BigDecimal para;
    private String alıcı;

    public MusteriDto() {}
    public MusteriDto(String musteriAdi, String kartno, BigDecimal para,String alıcı) {
        this.musteriAdi=musteriAdi;
        this.kartno=kartno;
        this.para=para;
        this.alıcı=alıcı;
    }
    public String getMusteriAdi() {
        return musteriAdi;
    }
    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }
    public String getKartno() {
        return kartno;
    }
    public void setKartno(String kartno) {
        this.kartno = kartno;
    }
    public BigDecimal getPara() {
        return para;
    }
    public void setPara(BigDecimal para) {
        this.para = para;
    }
    public String getAlıcı(){
        return alıcı;
    }
    public void setAlıcı(String alıcı){
        this.alıcı=alıcı;
    }
}

