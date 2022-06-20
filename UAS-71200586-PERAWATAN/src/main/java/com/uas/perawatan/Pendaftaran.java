package com.uas.perawatan;
import java.sql.*;

public class Pendaftaran {
    private int idPendaftaran;
    private String nama;
    private String url = "jdbc:mysql://localhost/perawatan";
    private String user = "root";
    private String pass = "";
    Connection conn = null;

    public Pendaftaran(int idPendaftaran, String nama) {
        this.idPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public int getIdPendaftaran() {
        return idPendaftaran;
    }

    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Daftar daftar, Perawat perawat){
        if (pengunjung.getStatus() == "sakit"){
            try{
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi berhasil.");
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }finally {
                try{
                    if ( conn != null ){
                        conn.close();
                    }
                } catch (SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }

            String sql = "INSERT INTO pengunjung (nama, usia, alamat) VALUES ('" + pengunjung.getNama() + "','" + pengunjung.getUsia() + "','" + pengunjung.getAlamat() + "')";
            String sql2 = "INSERT INTO daftar (idPemeriksaan, rm, idPemeriksa, idPerawat, idPendaftaran, status) VALUES ('" + daftar.getIdPemeriksaan() + "','" + pengunjung.getRm() + "','" + pemeriksa.getIdPemeriksa() + "','" + perawat.getIdPerawat() + "','" + idPendaftaran + "','" + pengunjung.getStatus() + "')";
            try (Connection conn = DriverManager.getConnection(url, user, pass);
                 Statement stmt = conn.createStatement()) {
                stmt.execute(sql);
                System.out.println("Data pengunjung berhasil masuk!");
                stmt.execute(sql2);
                System.out.println("Data daftar berhasil masuk!");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            daftar.setStatusDaftar(true);
        }else{
            System.out.println("Maaf pengunjung tidak sakit!");
        }
    }

    public Pengunjung registrasi(){
        Pengunjung pengunjung = new Pengunjung();
        pengunjung.getNama();
        pengunjung.getPenyakit();
        pengunjung.getLevelPenyakit();
        pengunjung.getAlamat();
        pengunjung.getStatus();
        pengunjung.getUsia();
        pengunjung.getRm();
        return pengunjung;
    }
}
