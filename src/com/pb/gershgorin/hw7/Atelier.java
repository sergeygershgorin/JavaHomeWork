package com.pb.gershgorin.hw7;

public class Atelier {

    private static void dressMan(Clothes[] clothes) {
        for (Clothes cl:clothes) {
            if (cl instanceof ManClothes) {
                ((ManClothes) cl).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for (Clothes cl:clothes) {
            if (cl instanceof WomenClothes) {
                ((WomenClothes) cl).dressWomen();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.M, 10, "green"),
                new Pants(Size.XL, 20, "brawn"),
                new Skirt(Size.S, 30, "blue"),
                new Tie(Size.L,40, "multicolored")
        };

        System.out.println("Mens clothing:");
        dressMan(clothes);

        System.out.println(System.lineSeparator() + "Womens clothing:");
        dressWomen(clothes);
    }


}