package com.ug14.rumahsakit;

public class Pasien {
    private int rm;
    String nama;
    int usia;
    private String alamat;
    String penyakit;
    int levelPenyakit = 3;
    boolean status = false;

    public int getLevelPenyakit(){
        return this.levelPenyakit;
    }
}
