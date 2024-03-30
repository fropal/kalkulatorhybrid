package com.example.kalkulatorhybrid.recyclerview;

public class model_kalkulator {

    String nama;
    String rumus;
    int img;

    public model_kalkulator(String nama, String rumus, int img) {
        this.nama = nama;
        this.rumus = rumus;
        this.img = img;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRumus() {
        return rumus;
    }

    public void setRumus(String rumus) {
        this.rumus = rumus;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}