package com.ug5a.soal2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void infoSepatu(Sepatu shoes){
        System.out.println("-----"+ shoes.getMerkModel() + "-----");
        System.out.println("Kode:" +" "+ shoes.getKode());
        System.out.println("Ukuran:" +" "+ shoes.getUkuran());
        System.out.println(("Harga:" +" "+ shoes.getHarga()));
        System.out.println("Stok:" +" "+ shoes.getStok());
    }
    public static void main( String[] args ) {
        Sepatu nikeA = new Sepatu("Nike Air Jordan 1 High OG", 40, 3500000, 5);
        Sepatu nikeB = new Sepatu("Nike Blazer", 38, 750000, 10);
        Sepatu nikeC = new Sepatu("Nike SB Dunk Low J-Pack Shadow", 36, 1300000, 2);
        System.out.println("\n========== Daftar Sepatu Nike==========\n");
        infoSepatu(nikeA);
        infoSepatu(nikeB);
        infoSepatu(nikeC);
    }
}
