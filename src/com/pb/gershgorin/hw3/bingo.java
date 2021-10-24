package com.pb.gershgorin.hw3;

import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1 = 11;
        int input;
        int attempt = 0;
        System.out.println("Пожалуйста, угадайте число от 0 до 100, для выхода из игры введите число больше 100:");
        do {
            attempt++;
            input = scan.nextInt();
            if(input > 100)
            {break;}
        } while (operand1 != input);
        System.out.println("Спасибо за игру! Вы сделали попыток:" + attempt);}
    }
