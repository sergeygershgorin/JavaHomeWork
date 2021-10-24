package com.pb.gershgorin.hw3;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        int positiv = 0;

        System.out.println("Введите 10 элементов массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Вы ввели:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов массива:" + sum);

        for (int i = 0; i < array.length; i++) {
            if (array[i]>0){positiv++;};
        }
        System.out.println("Количество положительных элементов массива:" + positiv);
    }
}
