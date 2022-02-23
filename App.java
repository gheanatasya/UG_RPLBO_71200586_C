package com.ug3.soal2;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int running = 10;
        int jumlah;
        System.out.println( "Bilangan Fibonacci dari kata" );
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan input pertama: ");
        String kalimatsatu = input.nextLine();
        System.out.println("Masukan input kedua: ");
        String kalimatdua = input.nextLine();
        System.out.println( "Bilangan Fibonacci");
        int n1 = kalimatsatu.length();
        int n2 = kalimatdua.length();
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 1; i <= running; i++) {
            System.out.println(n1);
            jumlah = n1 + n2;
            System.out.println(jumlah);
            n1 = n2;
            n2 = jumlah;
        }
        System.out.println( "Keluar dari program (ketikan exit) : ");
        String keluar = input.nextLine();
        if (keluar != "exit") {
            System.out.println("Masukan input pertama: ");
        } else {
            System.out.println("Keluar");
        }



    }
}
