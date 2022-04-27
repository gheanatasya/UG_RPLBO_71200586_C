package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if(saldo < 0){
            System.out.println("Input tidak valid! Transfer gagal!");
            checkFee = false;
        }else if(saldo < nominal){
            System.out.println("Transfer gagal, saldo tidak mencukupi!");
            checkFee = false;
        }else{
            checkFee = true;
            saldo = saldo - (nominal + feeAntarBank);
            saldo = saldo + nominal;
            printBuktiTransfer(dp, nominal);
        }
    }

    public boolean isCheckFee(){
        if(saldo < 0){
            return checkFee;
        }else{
            checkFee = true;
            return checkFee;
        }
    }
    public void setCheckFee(boolean checkFee){
        this.checkFee = checkFee;
    }
}
