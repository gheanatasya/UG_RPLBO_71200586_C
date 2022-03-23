package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet(User user) {
        this.user = new User(user.getNama(), user.getEmail(), user.getUang());
    }

    public void topup(int jumlah) {
        if (jumlah > 0) {
            this.user.topup(jumlah);
            this.saldo += jumlah;
            System.out.println("Halo, " + this.getUser().getNama() + "! Top up saldo sebesar " + App.formatRupiah(jumlah) + " berhasil!");
        } else if (this.user.getUang() < jumlah) {
            System.out.println("Cash kamu tidak mencukupi! (" + App.formatRupiah(this.user.getUang() - jumlah) + ")");
        } else {
            System.out.println("Jumlah yang kamu masukkan salah!");
        }
    }

    public void pay(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Jumlah yang kamu masukkan salah!");
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo kamu tidak mencukupi! (" + App.formatRupiah(this.saldo - jumlah) + ")");
        } else {
            this.saldo -= jumlah;
        }
    }

    public void transfer(eWallet eWallet, int jumlah) {
        if (jumlah > 0) {
            this.saldo -= jumlah;
            eWallet.uangmasuk(jumlah);
            System.out.println("Transfer saldo sejumlah " + App.formatRupiah(jumlah) + " ke akun " + eWallet.getUser().getNama() + " berhasil!");
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo kamu tidak mencukupi! (" + App.formatRupiah(this.saldo - jumlah) + ")");
        } else {
            System.out.println("Jumlah yang kamu masukkan salah!");
        }
    }

    private void uangmasuk(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Jumlah yang kamu masukkan salah!");
        } else {
            this.saldo += jumlah;
        }
    }

    public void withdraw(int jumlah) {
        if (jumlah > 0) {
            this.saldo -= jumlah;
            this.user.withdraw(jumlah);
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo kamu tidak mencukupi! (" + App.formatRupiah(this.saldo - jumlah) + ")");
        } else {
            System.out.println("Jumlah yang kamu masukkan salah!");
        }
    }

    public User getUser() {
        return this.user;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void getInfo() {
        System.out.println("Nama: " + this.user.getNama() + " [PIN: " + this.user.getPIN() + "]");
        String email = "";
        if (this.user.isEmailConfirmed()) {
            email = "[Confirmed]";
        }

        System.out.println("Email: " + this.user.getEmail() + " " + email);
        System.out.println("Uang cash: " + App.formatRupiah(this.user.getUang()));
        System.out.println("Saldo e-wallet: " + App.formatRupiah(this.getSaldo()));
        System.out.println();
    }}
