package com.pb.gershgorin.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.makeNoise();
        System.out.println(animal.getName() + " его еда: " + animal.getFood() + ".");
        System.out.println(animal.getName() + " ареал обитания: " + animal.getLocation() + ".");
    }
}