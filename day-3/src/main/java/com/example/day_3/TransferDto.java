package com.example.day_3;

public class TransferDto {
    private String gönderen;
    private String alıcı;
    private double para;
    private String aciklama;

    public  TransferDto() {}
    public TransferDto(String gönderen ,String alıcı,double para,String aciklama) {
        this.aciklama=aciklama;
        this.alıcı=alıcı;
        this.para=para;
        this.gönderen=gönderen;
    }
    public double getPara() {
        return para;
    }
    public void setPara(double para) {
        this.para = para;
    }
    public String getAciklama() {
        return aciklama;
    }
    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public void setAlıcı(String alıcı) {
        this.alıcı = alıcı;
    }

    public String getAlıcı() {
        return alıcı;
    }

    public String getGönderen() {
        return gönderen;
    }

    public void setGönderen(String gönderen) {
        this.gönderen = gönderen;
    }
}
