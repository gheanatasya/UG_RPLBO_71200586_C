package com.ug5a.soal1;
import java.security.Key;

public class TransPay {
    private String nama;
    private long saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void topUp(long jumlah) {
        if (jumlah > 0) {
            this.saldo = saldo + jumlah;
            System.out.println("Top up sebesar Rp " + jumlah + " berhasil");
        }else{
            System.out.println("Nominal anda tidak valid! Nominal harus lebih dari 0");
        }
    }

    public void bayar(int jumlahbayar, Keyboard k) {
        if (jumlahbayar > 0) {
            if (saldo > (jumlahbayar * k.getHarga())) {
                System.out.println("Pembayaran sukses! Silahkan mengambil " + k.getMerkModel() + "di counter");
                saldo = saldo - (jumlahbayar * k.getHarga());
            } else {
                System.out.println("Pembayaran gagal! Saldo Anda Kurang, silahkan melakukan top up!");
            }
        }else{
            System.out.println("Input jumlah tidak valid!");
        }

    }
}
