package com.uas.perawatan;
import java.sql.*;

public class Pemeriksa {
    private int idPemeriksa;
    private String nama;
    private String spesialis;
    private String ruangan;
    private String url = "jdbc:mysql://localhost/perawatan";
    private String user = "root";
    private String pass = "";
    Connection conn = null;

    public Pemeriksa(int idPemeriksa, String nama, String spesialis, String ruangan) {
        this.idPemeriksa = idPemeriksa;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public Pemeriksa() {

    }

    public String getNama() {
        return nama;
    }

    public int getIdPemeriksa() {
        return idPemeriksa;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Daftar daftar){
        if (daftar.getStatusDaftar() == true && daftar.getStatusScreening() == true){
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
            String sql = "SELECT idPemeriksa FROM daftar";
            try (Connection conn = DriverManager.getConnection(url, user, pass);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    if (rs.getInt("idPemeriksa") == idPemeriksa) {
                        pengunjung.levelPenyakit -= 1;
                    }
                }
                if (pengunjung.levelPenyakit == 0){
                    pengunjung.setStatus("sembuh");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public String cekStatus(Pengunjung pengunjung, Daftar daftar){
        if (pengunjung.getStatus() == "sembuh"){
            return "Pengunjung sudah sembuh!";
        }else{
            return "Pengunjung belum sembuh!";
        }
    }
}
