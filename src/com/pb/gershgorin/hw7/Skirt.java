package com.pb.gershgorin.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, int price, String color) {
        super(size, price, color); }

    @Override
    public void dressWomen() {
        System.out.println("Skirt " + size.getDescription() + " euro " + size.getEuroSize()
                + "num " + size + "  " + "colour " + color + "  " + "price " + price);
    }
}