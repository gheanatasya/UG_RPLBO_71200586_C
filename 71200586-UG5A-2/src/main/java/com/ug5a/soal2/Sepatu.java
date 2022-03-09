package com.ug5a.soal2;

public class Sepatu {
    private String kode;
    private static int nextNum;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    public Sepatu(String argMerkModel, int argUkuran, long argHarga, int argStok) {
        kode = ("NK0024510" + nextNum);
        nextNum = nextNum ++;
        this.merkModel = argMerkModel;
        this.ukuran = argUkuran;
        this.harga = argHarga;
        this.stok = argStok;
    }

    public String getKode() {
        return kode;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
