
import java.util.Scanner;
public class Main {

    public static void main(String args[]){
        Mobil M_71200586;
        M_71200586 =  new Mobil();
        PejalanKaki P_71200586;
        P_71200586 = new PejalanKaki();
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();
        if (kodeLampu == 1) {
            System.out.println("-----Lampu Hijau-----");
            System.out.println("M_71200586 jalan...");
            System.out.println("P_71200586 menunggu...");
        } else if (kodeLampu == 2) {
            System.out.println("-----Lampu Kuning-----");
            System.out.println("M_71200586 mengurangi kecepatan...");
            System.out.println("P_71200586 bersiap menyeberang jalan...");
        } else if (kodeLampu == 3) {
            System.out.println("-----Lampu Merah-----");
            System.out.println("M_71200586 berhenti...");
            System.out.println("P_71200586 menyeberangi jalan...");
        } else {
            System.out.println("Kode lalu lintas tidak valid");
        }

    }
}
