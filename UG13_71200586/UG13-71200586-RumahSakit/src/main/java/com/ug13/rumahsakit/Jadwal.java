package com.ug13.rumahsakit;

public class Jadwal {
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    Boolean statusDaftar = false;
    Boolean statusScreening = false;

    public Pasien getPasien() {
        return this.pasien;
    }
}
