package com.ug14.rumahsakit;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    private String url = "jdbc:sqlite:rumahsakit.db";
    public Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Koneksi berhasil.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(url)){
            if (conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Nama: " + meta.getDriverName());
                System.out.println("Database tercipta");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void createNewTable(){
        String sql = "CREATE TABLE IF NOT EXISTS pasien (\n" + " rm int(8) PRIMARY KEY, \n" + "nama text NOT NULL, \n"
                + "usia int NOT NULL, \n" + "alamat text NOT NULL \n" + ");";

    }
    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, String dokter, Suster suster, Jadwal jadwal){
        if(pasien.status == false){
            dokter = jadwal.dokter;
            String b = pasien.nama;
            String c = suster.nama;
            jadwal.dokter = dokter;
            jadwal.pasien = b;
            jadwal.statusDaftar = true;
            jadwal.statusScreening = false;
            jadwal.suster = c;
        }else{
            System.out.println("Maaf pasien harus sakit terlebih dahulu!");
            jadwal.statusDaftar = false;
            jadwal.statusScreening = false;
        }
    }

    public Pasien registrasi(){
        Pasien pasien = new Pasien();
        String name = pasien.nama;
        int usia = pasien.usia;
        String penyakit = pasien.penyakit;
        int levelPenyakit = pasien.levelPenyakit;
        boolean status = pasien.status;
        System.out.println("Registrasi berhasil!");
        return pasien;
    }
}
