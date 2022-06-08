package com.ug14.rumahsakit;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
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

    public Dokter getDokterById(int){}
    public Suster getSusterById(int){}
    public Pelayanan getPelayananById(int){}
    public inputPasien(Pasien){}
    public inputJadwal(Jadwal){}
    public void getPasienSembuh(){}
}
