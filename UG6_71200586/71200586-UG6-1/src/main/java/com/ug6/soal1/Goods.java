package com.ug6.soal1;

public class Goods {
    private int code;
    private String name;
    private int quantity;
    private double price;

    public Goods() {}

    public Goods(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Goods(int code, String name, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
