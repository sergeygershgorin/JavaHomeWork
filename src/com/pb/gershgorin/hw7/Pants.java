package com.pb.gershgorin.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        pantsMF("male");
    }

    @Override
    public void dressWomen() {
        pantsMF("female");
    }

    private void pantsMF(String gender) {
        System.out.println("Pants " + "  " + gender + "  " + size.getDescription() + " euro " + size.getEuroSize()
                + " num " + size + "  " + " colour " + color + "  " + " price " + price);
    }
}