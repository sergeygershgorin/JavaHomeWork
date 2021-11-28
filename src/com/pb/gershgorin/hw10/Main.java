package com.pb.gershgorin.hw10;

public class Main {

    public static void main(String[] args) {
        NumBox<Integer> numBox1 = new NumBox<>(4);
        NumBox<Float> numBox2 = new NumBox<>(3);
        System.out.println("- - - Integer - - -");
        numBox1.add(1);
        numBox1.add(2);
        numBox1.add(7);
        numBox1.add(10);
        System.out.println("Amount of elements: " + numBox1.length());
        System.out.println("Sum: " + numBox1.sum());
        System.out.println("Average: " + numBox1.average());
        System.out.println("Maximum: " + numBox1.max());
        System.out.println(System.lineSeparator() + "- - - Float - - -");
        numBox2.add(0f);
        numBox2.add(2.3f);
        numBox2.add(3.14F);
        System.out.println("Amount of elements: " + numBox2.length());
        System.out.println("Sum: " + numBox2.sum());
        System.out.println("Average: " + numBox2.average());
        System.out.println("Maximum: " + numBox2.max());
    }
}