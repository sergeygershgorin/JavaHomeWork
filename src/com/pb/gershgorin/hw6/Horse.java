package com.pb.gershgorin.hw6;

import java.util.Objects;

public class Horse extends Animal{

//    private String volume = "тыгдым-тыгдым-тыгдым";
      private String volume;

    public Horse(String name, String food, String location, String volume) {
        super(name, food, location);
        this.volume = volume;
    }

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    public String getVolume() {
        return volume;
    }

  /*  public void setVolume(String volume) {
        this.volume = volume;
    }
*/
    @Override
    public String getName() {
        return "Лошадка " + super.getName();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(volume);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " неторопливо хрумает " + getFood());
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this == null || this.getClass() != obj.getClass())
            return false;
        Horse horse = (Horse) obj;
        return  getName().equals(horse.getName()) &&
                getFood().equals(horse.getFood()) &&
                getLocation().equals(horse.getLocation()) &&
                getVolume().equals(getVolume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFood(), getLocation(), getVolume());
    }

    @Override
    public String toString() {
        return "Лошадь " + getName() + ": живет в " + getLocation() + " шумно скачет " + getVolume();
    }
 }