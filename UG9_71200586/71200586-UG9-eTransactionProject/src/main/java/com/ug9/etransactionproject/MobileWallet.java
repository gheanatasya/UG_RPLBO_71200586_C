package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp){
        super(nama, saldo);
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank){
        this.feeTransferBank = feeTransferBank;
    }
    public String getNoHp(){
        return noHp;
    }

    public long getFeeTransferBank() {
        return feeTransferBank;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if(saldo < 0){
            System.out.println("Transfer gagal! Input tidak valid!");
        }else if(saldo < nominal){
            System.out.println("Transfer gagal! Saldo tidak mencukupi!");
        }else{
            if (dp instanceof BNImo || dp instanceof BRImo) {
                saldo = saldo - (nominal + feeTransferBank);
                saldo = saldo + nominal;
                printBuktiTransfer(dp, nominal);
            }
        }
    }
}
