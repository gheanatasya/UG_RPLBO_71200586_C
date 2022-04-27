package com.ug9.etransactionproject;

public class BNImo extends MobileBanking{
    public BNImo(String nama, long saldo, String noRekening){
        super(nama, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if(dp instanceof BRImo){
            setCheckFee(true);
            super.transfer(dp, nominal);
        }
    }
}
