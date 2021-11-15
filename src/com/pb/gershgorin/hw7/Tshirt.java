package com.pb.gershgorin.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        tshirtMF("male");
    }

    @Override
    public void dressWomen() {
        tshirtMF("female");
    }

    private void tshirtMF(String gender) {
        System.out.println("Tshirt " + "  " + gender + "  " + size.getDescription() + " euro " + size.getEuroSize()
                + " num " + size + " colour " + color + "  " + " price " + price);
    }
}