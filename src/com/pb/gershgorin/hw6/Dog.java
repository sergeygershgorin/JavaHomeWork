package com.pb.gershgorin.hw6;

public class Dog extends Animal {
    int volume;
    String food = "Purina";
    String collar;

    public Dog(){
        super("Собака");
    }

    public void makeNoise(){
        System.out.println(getName() + " шумит с громкостью" + volume + " децибел");
    }
    public void eat(){
        System.out.println(getName() + " кушает " + food);
    }
}
