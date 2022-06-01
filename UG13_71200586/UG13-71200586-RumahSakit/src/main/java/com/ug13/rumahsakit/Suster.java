package com.ug13.rumahsakit;
import java.io.*;

public class Suster{
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal){
        if(jadwal.statusDaftar == true){
            jadwal.statusScreening = true;
        }else{
            jadwal.statusScreening = false;
        }
    }
}
