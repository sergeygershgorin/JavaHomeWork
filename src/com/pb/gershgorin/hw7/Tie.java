package com.pb.gershgorin.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie " + size.getDescription() + " euro " + size.getEuroSize()
                + " num " + size + "  " + "colour " + color + "  " + " price " + price);
    }
}