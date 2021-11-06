package com.pb.gershgorin.hw6;

public class Howitworks {
    public static void main(String[] args) {
        Animal test = new Animal("Змей горыныч");
        test.sleep();
        test.makeNoise();

        Cat kitty = new Cat();
        kitty.makeNoise();

        Dog doggy = new Dog();
        doggy.eat();

        Horse horsy = new Horse();
        horsy.makeNoise();
    }
}
