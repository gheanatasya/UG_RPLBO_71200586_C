package com.ug4.soal1;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        initiateMenu();
    }

    private static void initiateMenu(){
        //menginisialisasikan object penumpang
        Passenger adit = new Passenger("Adit","adit@gmail.com",100000);
        Passenger surya = new Passenger("Surya","surya@gmail.com",20000);
        Passenger krismon = new Passenger("Krismon","krismon@gmail.com", 10000);
        Driver pakTole = new Driver("Pak Tole","pria",35);

        /*
        Membuat instance object Bus. Disini tarif perjalanan (fares) yang diatur adalah Rp 15.000
        kalian bebas mengatur jumlah tarif perjalanan (fares) sesuai keinginan kalian pada Class Bus
         */
        Bus dutaBus = new Bus("Duta Bus",pakTole);

        /*
        masuk pada test case. sistem akan langsung mengarahkan pada method menu()
         */
        System.out.println("Duta Bus");
        //case penumpang adit
        menu(adit,dutaBus);
        //case penumpang surya
        menu(surya,dutaBus);
        //case penumpang krismon
        menu(krismon,dutaBus);

        //case telah sampai di tujuan pertama
        System.out.println("Pemberhentian pertama telah sampai pada Kampus Universitas Kristen Duta Wacana");
        dutaBus.dropPassengers(dutaBus.getRoute()[0],adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[0],surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[0],krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();

        //case telah sampai di tujuan kedua
        System.out.println("Pemberhentian kedua telah sampai pada Asrama Omah Babadan");
        dutaBus.dropPassengers(dutaBus.getRoute()[1],adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[1],surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[1],krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();

        //case telah sampai di tujuan kedua
        System.out.println("Pemberhentian ketiga telah sampai pada Asrama Teologi");
        dutaBus.dropPassengers(dutaBus.getRoute()[2],adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[2],surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[2],krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();

        //menampilkan keuntungan yang diperoleh
        System.out.println("Keuntungan hari ini");
        System.out.println("Keuntungan sebesar : Rp " +dutaBus.getProfit() + "0;-");
    }

    private static void menu(Passenger passenger, Bus bus){
        System.out.println("Selamat Datang Kak " + passenger.getName());
        /*
        Lengkapilah method ini agar sesuai dengan ketentuan dan output
        case : mengecek apakah saldo yang dimiliki penumpang lebih dari tarif perjalanan atau tidak
        jika tidak, maka akan mengarahkan ke menu top up. Namun jika cukup maka akan mengarahkan
        ke menampilkan destinasi tujuan
         */
        System.out.println("============================================\n\n\n");
    }

    private static void showDestination(
            Bus bus,
            Passenger passenger
    ){
        String destiny;
        int i = 0;
        System.out.println("Pilihan rute perjalanan");
        for(String rute : bus.getRoute()){
            i++;
            System.out.print(i + ". " + rute + "\n");
        }
        System.out.print("masukan destinasi perjalanan anda : ");
        destiny = scanner.nextLine();
        //mengecek apakah input sudah sesuai atau belum
        if(destiny.isEmpty()) {
            /*
            Lengkapilah method ini agar sesuai dengan ketentuan dan output
            case: jika tidak sesuai maka akan menampilkan error, kemudian akan memanggil kembali
            method showDestination()
             */
        }
        else{
            for(String route: bus.getRoute()){
                /*
                Lengkapilah method ini agar sesuai dengan ketentuan dan output
                case: melakukan pengecekan apakah route yang diinputkan sesuai dengan ketiga rute yang ada.
                Kika sesuai maka order perjalanan akan diproses (proceed order). Namun jika input tidak sesuai,
                maka akan menampilkan error message dan akan mengarahkan kembali pada method showDestination()
                 */
            }
        }
    }

    private static void topUpMenu(
            Bus bus,
            Passenger passenger
    ){
        String choice;
        double balance;
        System.out.println("Anda ingin top up ?");
        System.out.print("jawaban anda (ya/tidak): ");
        choice = scanner.nextLine();
        //melakukan pengecekan pada input pilihan
        if(choice.equalsIgnoreCase("ya")) {
            System.out.print("Masukan nominal top up : ");
            /*
            Lengkapilah method ini agar sesuai dengan ketentuan dan output
            case: melakukan pengecekan apakah input balance kosong atau tidak. Jika kosong maka
            akan menampilkan error message dan kembali memanggil method topUpMenu(). Namun jika
            input tidak kosong maka akan memproses top up saldo dan akan mengarahkan ke method
            showDestination()
             */
        }
        else if(choice.equalsIgnoreCase("tidak")){
            /*
            Lengkapilah method ini agar sesuai dengan ketentuan dan output
            case: jika input menunjukan tidak, maka akan membatalkan order perjalanan
             */
        }
        else{
            /*
            Lengkapilah method ini agar sesuai dengan ketentuan dan output
            case: jika input bukan ya/tidak, maka akan menampilkan error message dan
            akan kembali memanggil method topUpMenu();
             */
        }

    }
}
