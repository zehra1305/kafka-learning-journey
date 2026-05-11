package com.example.day_8;

public class StudentDto {
    private int id;
    private String adi;
    private String soyadi;
    private int ogrenciNumarasi;
    private String sinifi;

    public StudentDto() {}
    public StudentDto(int id,String adi,String soyadi,int ogrenciNumarasi,String sinifi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.ogrenciNumarasi = ogrenciNumarasi;
        this.sinifi = sinifi;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAdi() {
        return adi;
    }
    public void setAdi(String adi) {
        this.adi = adi;
    }
    public String getSoyadi() {
        return soyadi;
    }
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    public int getOgrenciNumarasi() {
        return ogrenciNumarasi;
    }
    public void setOgrenciNumarasi(int ogrenciNumarasi) {
        this.ogrenciNumarasi = ogrenciNumarasi;
    }
    public String getSinifi() {
        return sinifi;
    }
    public void setSinifi(String sinifi) {
        this.sinifi = sinifi;
    }

}
