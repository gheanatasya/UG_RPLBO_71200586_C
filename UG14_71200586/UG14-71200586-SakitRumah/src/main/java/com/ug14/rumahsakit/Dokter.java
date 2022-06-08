package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    String nama;
    private String spesialis;
    private String ruangan;

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if(jadwal.statusScreening == true){
            if(jadwal.dokter == this.nama){
                while(pasien.levelPenyakit != 0){
                    pasien.levelPenyakit -= 1;
                }
            }else{
                System.out.println("Yang memeriksa harus dokter terjadwal!");
            }
        }else{
            System.out.println("Harus melakukan screening terlebih dahulu!");
        }
    }
    public void cekStatus(Pasien pasien){
        if(pasien.status == true){
            System.out.println("Pasien sudah sembuh!");
        }else{
            System.out.println("Pasien masih sakit!");
        }
    }
}
