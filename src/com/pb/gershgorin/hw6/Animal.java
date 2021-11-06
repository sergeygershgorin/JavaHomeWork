package com.pb.gershgorin.hw6;

public class Animal {
    private String name;
    private String food;
    private String location;

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     public void makeNoise(){
        System.out.println(name + " шумит");
    }

    public void eat(){
        System.out.println(name + " кушает");
    }

    public void sleep(){
        System.out.println(name + " спит");
    }
}
