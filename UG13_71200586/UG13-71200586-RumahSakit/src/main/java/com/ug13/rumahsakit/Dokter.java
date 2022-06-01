package com.ug13.rumahsakit;
import java.io.*;

public class Dokter{
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        while(jadwal.statusScreening == true && pasien.levelPenyakit != 0){
            pasien.levelPenyakit -= 1;
        }
        if(pasien.levelPenyakit == 0){
            pasien.status = "True";
        }
    }

    public String cekStatus(Pasien pasien){
        return pasien.status;
    }
}
