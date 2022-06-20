package com.uas.perawatan;
import java.sql.*;

public class DAO {
    private String url = "jdbc:mysql://localhost/perawatan";
    private String user = "root";
    private String pass = "";
    Connection conn = null;

    private Perawat getPerawatByID(int idPerawat){
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
        String sql = "SELECT * FROM daftar WHERE idPerawat = '" + idPerawat + "'";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("idPemeriksaan") + "\t" +
                        rs.getInt("rm") + "\t" +
                        rs.getInt("idPemeriksa") + "\t" + rs.getInt("idPerawat") + "\t" + rs.getInt("status") + "\t" + rs.getInt("idPendaftaran"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    private Pemeriksa getPemeriksaByID(int idPemeriksa){
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
        String sql = "SELECT * FROM daftar WHERE idPemeriksa = '" + idPemeriksa + "'";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("idPemeriksaan") + "\t" +
                        rs.getInt("rm") + "\t" +
                        rs.getInt("idPemeriksa") + "\t" + rs.getInt("idPerawat") + "\t" + rs.getInt("status") + "\t" + rs.getInt("idPendaftaran"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
    public void inputDaftar(Daftar daftar){
        Pengunjung pengunjung = new Pengunjung();
        Pemeriksa pemeriksa = new Pemeriksa();
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
    }
    public void inputPengunjung(Pengunjung pengunjung){
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
    }
    private Pendaftaran getPendaftaranByID(int idPendaftaran){
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
        String sql = "SELECT * FROM daftar WHERE idPendaftaran = '" + idPendaftaran + "'";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("idPemeriksaan") + "\t" +
                        rs.getInt("rm") + "\t" +
                        rs.getInt("idPemeriksa") + "\t" + rs.getInt("idPerawat") + "\t" + rs.getInt("status") + "\t" + rs.getInt("idPendaftaran"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
    public static Pengunjung getPengunjungSembuh(){
        Pengunjung pengunjung = new Pengunjung();
        if (pengunjung.status == "sembuh"){
        }else{

        }
        return pengunjung;
    }
}
