package com.uas.perawatan;
import java.sql.*;

public class Perawat {
    private int idPerawat;
    private String nama;
    private String url = "jdbc:mysql://localhost/perawatan";
    private String user = "root";
    private String pass = "";
    Connection conn = null;

    public Perawat(int idPerawat, String nama) {
        this.idPerawat = idPerawat;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getIdPerawat() {
        return idPerawat;
    }

    public void screening(Pengunjung pengunjung, Daftar daftar){
        if (daftar.getStatusDaftar() == true){
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
            String sql = "SELECT idPerawat FROM daftar";
            try (Connection conn = DriverManager.getConnection(url, user, pass);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        if (rs.getInt("idPerawat") == idPerawat) {
                            daftar.setStatusScreening(true);
                        }
                    }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Maaf harus melalui pendaftaran terlebih dahulu!");
        }
    }
}
