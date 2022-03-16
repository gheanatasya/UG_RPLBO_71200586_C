package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private int code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    public VendingMachines() {
        System.out.println("Constructor VendingMachine dipanggil");
    }

    public VendingMachines(int code, int capacity) {
        this.code = code;
        this.capacity = capacity;
    }

    public VendingMachines(int code, int capacity, Goods goods, double acceptanceBalance[]) {
        this.code = code;
        this.capacity = capacity;
        this.acceptanceBalance = acceptanceBalance;

    }

    public void proceedOrder(String goodsCode, int orderQuantity) {

    }

    public void takeMoney(double money) {

    }

    public void giveGood(double goodsPrice, String goodsName) {

    }

    public double withdrawMoney() {

    }

    public void inputGoods(Goods good) {

    }
}
