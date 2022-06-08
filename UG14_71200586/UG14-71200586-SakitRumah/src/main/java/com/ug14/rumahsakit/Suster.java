package com.ug14.rumahsakit;

public class Suster {
    private int idSuster;
    String nama;

    public Suster(String nama) {
         this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal){
        if(jadwal.statusDaftar == true){
            if(jadwal.suster != this.nama){
                System.out.println("Maaf error!");
            }else{
                jadwal.statusScreening = true;
            }
        }else{
            jadwal.statusScreening = false;
        }
    }
}
