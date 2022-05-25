package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kassa {
    private HashMap<Produk, Integer> pesanan;
    private ArrayList<Kasir> arrKasir;
    private Kasir kasir;

    public Kassa(){}
    public void login(String username, String password){
        for(int i = 0; arrKasir.size(); i++) {
            for (int j = 0; arrKasir.get(i).length; j++) {
                if (arrKasir[i][j].contains(username) || arrKasir[i][j].contains(password)) {
                    this.kasir = arrKasir.get(i);
                    System.out.println("User berhasil login!");
                } else {
                    System.out.println("Username atau Password Anda salah!");
                }
            }
        }
    }

    public void register(Kasir kasir){
        arrKasir.add(kasir);
    }

    public void tambahPesanan(Produk produk, int jumlah){
        this.pesanan.put(produk, jumlah);
    }

    public void printNota(){
        System.out.println("Kasir : ");
        System.out.println("No.  Nama Barang      Jumlah       Harga       Sub Total");
        int nomor = 1;
        for(Map.Entry map : pesanan.entrySet()){
            System.out.println(nomor + "  " + map.getKey() + "      " + map.getValue() + "       " + map.getKey() + "      " + map.getKey());
            nomor++;
        }
        System.out.println("Total: ");
    }

    public void printPenjualanKasir(){
        int nomor = 1;
        System.out.println("Daftar Kasir: ");
        System.out.println("No.   Nama                     Total Penjualan");
        for(int i = 0; arrKasir.size(); i++){
            for (int j = 0; arrKasir.get(i).size(); j++) {
                if(arrKasir[i][0]){
                    System.out.println(nomor + "    " + arrKasir[i][0] + "                      " + " ");
                }
            }
        }
    }

}
