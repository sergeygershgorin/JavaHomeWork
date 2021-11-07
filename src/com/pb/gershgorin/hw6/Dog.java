package com.pb.gershgorin.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private String collar;

    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    public Dog(String name, String food, String location, String collar) {
        super(name, food, location);
        this.collar = collar;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public String getName() {
        return "Собака " + super.getName();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(" воет по ночам, как волк");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " и с плямканем грызет кости");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Dog dog = (Dog) obj;
        return  getName().equals(getName()) &&
                getFood().equals(dog.getFood()) &&
                getLocation().equals(getLocation()) &&
                getCollar().equals(dog.getCollar());
    }

     @Override
     public int hashCode() {
         return Objects.hash(getName(), getFood(), getLocation(), getCollar());
     }

     @Override
     public String toString() {
        return "Собака " + getName() + ": живет в " + getLocation() + " и носит ошейник " + getCollar() + " цвета.";
    }
}