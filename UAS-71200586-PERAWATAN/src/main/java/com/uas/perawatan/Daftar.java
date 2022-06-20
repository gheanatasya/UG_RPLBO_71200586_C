package com.uas.perawatan;

public class Daftar {
    private int idPemeriksaan;
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public int getIdPemeriksaan() {
        return idPemeriksaan;
    }

    public Boolean getStatusDaftar() {
        return statusDaftar;
    }

    public Boolean getStatusScreening() {
        return statusScreening;
    }

    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }
}
