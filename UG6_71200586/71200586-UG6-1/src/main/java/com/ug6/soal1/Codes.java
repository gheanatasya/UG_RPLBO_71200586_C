package com.ug6.soal1;

public class Codes {
    private String GOODSCODES="GD";
    private String VENDINGMACHINESCODE="VM";
    private String TYPE="DR,FD,DG";

    public String generateGoodsCode(String type, String name) {
        if (type == "Makanan") {
            return this.GOODSCODES + "FD";
        }else if (type == "Minuman"){
            return this.GOODSCODES + "DR";
        }else if (type == "Digital") {
            return this.GOODSCODES + "DG"; }
    }

    public String generateVendingMachinesCode(int order) {
        return VENDINGMACHINESCODE + order;
            order = order ++;
    }
}
