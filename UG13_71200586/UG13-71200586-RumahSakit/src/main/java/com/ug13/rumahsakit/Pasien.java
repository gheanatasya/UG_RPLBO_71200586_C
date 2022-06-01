package com.ug13.rumahsakit;

public class Pasien implements java.io.Serializable{
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    int levelPenyakit = 3;
    String status = "False";

    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public int getLevelPenyakit() {
        return this.levelPenyakit;
    }

    public String getStatus() {
        return this.status;
    }
}
