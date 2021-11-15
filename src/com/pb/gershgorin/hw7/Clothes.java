package com.pb.gershgorin.hw7;

public abstract class Clothes {
    protected Size size;
    protected String color;
    protected int price;


    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
