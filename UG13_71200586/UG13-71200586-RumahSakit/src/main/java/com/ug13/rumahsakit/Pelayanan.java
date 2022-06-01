package com.ug13.rumahsakit;

public class Pelayanan{
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){
        if (pasien.status == "False"){
            jadwal.statusDaftar = true;
            jadwal.statusScreening = false;
        }else{
            jadwal.statusDaftar = false;
            jadwal.statusScreening = false;
        }
    }

    public Pasien registrasi() {
        return null;
    }
}
