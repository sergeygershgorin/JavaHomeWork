package com.pb.gershgorin.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private int tailLenght;

    public int getTailLengh() {
        return tailLenght;
    }

    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }

    public Cat(String name, String food, String location, int tailLenght) {
        super(name, food, location);
        this.tailLenght = tailLenght;
    }

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " обильно питается: " + getFood());
    }

    @Override
    public String getName() {
        return "Cat " + super.getName();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(" как реактивный самолет ");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this == null || this.getClass() != obj.getClass())
            return false;
        Cat cat = (Cat) obj;
        return getName().equals(cat.getName()) &&
                getLocation().equals(cat.getLocation()) &&
                getFood().equals(cat.getFood()) &&
                getTailLengh() == cat.getTailLengh();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFood(), getLocation(), getTailLengh());
    }

    @Override
    public String toString() {
        return "Кот " + getName() + ": живет в " + getLocation() + " и имеет длинный хвост, сантиметров эдак " +
                getTailLengh();
    }
}
