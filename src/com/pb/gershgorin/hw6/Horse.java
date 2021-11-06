package com.pb.gershgorin.hw6;

public class Horse extends Animal {
    String volume = "тыгдым-тыгдым-тыгдым";
    String food = "Сено";

    public Horse(){
        super("Лошадь");
    }

    public void makeNoise(){
        System.out.println(getName() + " скачет " + volume);
    }
    public void eat(){
        System.out.println(getName() + " кушает " + food);
    }
}