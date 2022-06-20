package com.uas.perawatan;

public class Pengunjung {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    int levelPenyakit = 3;
    String status = "sakit";

    public Pengunjung(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public Pengunjung() {}

    public int getRm() {
        return rm;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public String getStatus() {
        return status;
    }
}
