package com.pb.gershgorin.hw2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("Пожалуйста, введите два числа и знак арифметической операции между ними:");

         operand1 = scan.nextInt();
         operand2 = scan.nextInt();
         sign = scan.next();

           switch (sign) {
               case"+":
                   System.out.println(operand1 + operand2);
                   break;
               case"-":
                   System.out.println(operand1 - operand2);
                   break;
               case"*":
                   System.out.println(operand1 * operand2);
                   break;
               case"/":
                   if(operand2 != 0) {System.out.println(operand1 / operand2);}
                       else {System.out.println("Деление на 0 запрещено");
                       }
                   break;
           }

    }
}