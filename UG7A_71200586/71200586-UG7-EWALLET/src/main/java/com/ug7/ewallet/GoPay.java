package com.ug7.ewallet;

import java.util.Scanner;

public class GoPay extends eWallet {
    private int feeTopup = 1000;
    private int feeTransfer = 500;
    private int feeWithdraw = 2500;

    public GoPay(User user) {
        super(user);
    }

    public void topup(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Maaf, minimal top up Rp10.000,00");
        } else if (jumlah + this.feeTopup > super.getUser().getUang()) {
            jumlah += this.feeTopup;
            System.out.println("Maaf, uang cash kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        } else {
            super.topup(jumlah);
            this.pay(this.feeTopup);
        }
    }

    public void getInfo() {
        System.out.println("[GoPay e-Wallet]");
        super.getInfo();
    }

    public void withdraw(int jumlah) {
        System.out.println("Withdraw saldo akan terkena potongan fee " + App.formatRupiah(this.feeWithdraw));
        if (jumlah + this.feeWithdraw > super.getSaldo()) {
            jumlah += this.feeWithdraw;
            System.out.println("Maaf, saldo kamu tidak mencukupi! (" + App.formatRupiah(this.getSaldo() - jumlah) + ")");
        } else {
            super.withdraw(jumlah);
            this.pay(this.feeWithdraw);
        }
    }

    public void transfer(eWallet eWallet, int jumlah) {
        System.out.print("Masukkan PIN kamu: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.print("Validasi PIN");
        App.tunggu(3);
        if (!password.equals(this.getUser().getPIN())) {
            System.out.println("Maaf, PIN yang kamu masukkan salah!");
        } else {
            System.out.println("Transfer saldo akan terkena potongan fee " + App.formatRupiah(this.feeTransfer));
            System.out.print("Transfer sedang diproses");
            App.tunggu(3);
            if (jumlah + this.feeTransfer > super.getSaldo()) {
                jumlah += this.feeTransfer;
                System.out.println("Maaf, saldo kamu tidak mencukupi! (" + App.formatRupiah(this.getSaldo() - jumlah) + ")");
            } else {
                super.transfer(eWallet, jumlah);
                this.pay(this.feeTransfer);
            }
        }
    }
}
