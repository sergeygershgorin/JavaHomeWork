package com.pb.gershgorin.hw2;

import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
         System.out.println("Пожалуйста, введите число от 0 до 100:");
         operand1 = scan.nextInt();
          if (operand1 >= 0 && operand1 <= 100) {
              if (operand1 >= 0 && operand1 <= 14) {
                  System.out.println("Вы попали в диапазон от 0 до 14");
              }
              if (operand1 >= 15 && operand1 <= 35) {
                  System.out.println("Вы попали в диапазон от 15 до 35");
              }
              if (operand1 >= 36 && operand1 <= 50) {
                  System.out.println("Вы попали в диапазон от 36 до 50");
              }
              if (operand1 >= 51 && operand1 <= 100) {
                  System.out.println("Вы попали в диапазон от 51 до 100");
              }
          }

    }
}
