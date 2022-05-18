package com.ug11.kalkulasirupiah;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int Total = 0;
        List<Integer> rupiahAngka = new ArrayList<Integer>();
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan teks: ");
        String teks = inputan.nextLine();
        String[] kata = teks.split(" ");
        String[] rupiah = new String[5];
        String rupiahPattern = "[A_Z][a-z][1-9]\\d*[,]\\d*";
        for (String i : kata) {
            if (i.matches(rupiahPattern)) {
                for (int j = 0; j < rupiah.length; j++) {
                    if (rupiah[j] == null) {
                        rupiah[j] = i;
                    }
                }
                String[] lagi = i.split("p");
                int num = Integer.parseInt(lagi[1]);
                rupiahAngka.add(num);
            }
        }
        for (int m : rupiahAngka){
            Total = Total + m;
        }

        System.out.println("Rincian biaya: ");
        for (int k = 0; k < rupiah.length; k++){
            if(k != rupiah.length){
                System.out.println(rupiah[k] + "+");
            }else{
                System.out.println(rupiah[k]);}
            }
        System.out.println("Total: " + Total);
    }
}
