package com.pb.gershgorin.hw6;

public class Cat extends Animal {
    int volume = 20;
    String food = "Кит Кэт";
    int tailLength;

  public Cat(){
        super("Кошка");
    }


    public void makeNoise(){
        System.out.println(getName() + " шумит с громкостью " + volume + " децибел");
    }
    public void eat(){
            System.out.println(getName() + " кушает " + food);
        }
 }
