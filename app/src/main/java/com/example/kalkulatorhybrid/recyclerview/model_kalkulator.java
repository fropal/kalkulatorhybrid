package com.example.kalkulatorhybrid.recyclerview;

import android.app.Activity;

public class model_kalkulator {

    String nama;
    String rumus;
    int img;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    private Activity activity;

    public model_kalkulator(String nama, String rumus, int img,Activity activity) {
        this.nama = nama;
        this.rumus = rumus;
        this.img = img;
        this.activity = activity;
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