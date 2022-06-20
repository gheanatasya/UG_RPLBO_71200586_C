package com.tas.CariSudutJam;
import java.sql.*;

public class CariSudutJam {
    private String url = "jdbc:sqlite:waktu.db";

    public Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
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

    public void createNewTable() {
        String sql = "CREATE TABLE IF NOT EXISTS waktu (\n"
                + " nomor integer(8) NOT NULL CONSTRAINT waktu_pk PRIMARY KEY AUTOINCREMENT, \n"
                + " waktu text NOT NULL, \n"
                + " sudut real NULL \n"
                + ");";

        String sql2 = "INSERT INTO waktu (waktu) values" + "('15:00'), ('07:30'), ('08:05'), ('17:35'), ('11:01');";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabel tercipta!");
            stmt.execute(sql2);
            System.out.println("Tabel terisi!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(){
        String[] time = {"15:00", "07:30", "08:05", "17:35", "11:01"};
            for (int i = 0; i < time.length; i++){
                int Jam = 0;
                int Menit = 0;
                int Sudut = 0;

                String[] bagi = time[i].split(":");
                if(bagi[0] == "13" || bagi[0] == "01"){
                    String jam = "1";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "14" || bagi[0] == "02"){
                    String jam = "2";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "15" || bagi[0] == "03"){
                    String jam = "3";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "16" || bagi[0] == "04"){
                    String jam = "4";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "17" || bagi[0] == "05"){
                    String jam = "5";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "18" || bagi[0] == "06"){
                    String jam = "6";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "19" || bagi[0] == "07"){
                    String jam = "7";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "20" || bagi[0] == "08"){
                    String jam = "8";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "21" || bagi[0] == "09"){
                    String jam = "9";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "22" || bagi[0] == "10"){
                    String jam = "10";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "23" || bagi[0] == "11"){
                    String jam = "11";
                    Jam = Integer.parseInt(jam);
                }else if(bagi[0] == "00" || bagi[0] == "12"){
                    String jam = "12";
                    Jam = Integer.parseInt(jam);
                }

                if(bagi[1] == "01"){
                    String menit = "1";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "02"){
                    String menit = "2";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "03"){
                    String menit = "3";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "04"){
                    String menit = "4";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "05"){
                    String menit = "5";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "06"){
                    String menit = "6";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "07"){
                    String menit = "7";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "08"){
                    String menit = "8";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "09"){
                    String menit = "9";
                    Menit = Integer.parseInt(menit);
                }else if(bagi[1] == "00"){
                    String menit = "0";
                    Menit = Integer.parseInt(menit);
                }else{
                    String menit = bagi[1];
                    Menit = Integer.parseInt(menit);
                }
                int a = (int) ((30 * Jam) + (0.5 * Menit));
                int b = 6 * Menit;
                int c = a - b;
                int d = Math.abs(c);
                int E = 360 - d;
                if (E > d){
                    Sudut = d;
                } else if (E < d){
                    Sudut = E;
                }
                String sql = "UPDATE waktu SET sudut = '"+ Sudut + "' WHERE waktu = '" + time[i] + "'";
                try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()){
                    stmt.execute(sql);
                    System.out.println("Sudut: " + Sudut + "sudah diupdate!");
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
    }


}
