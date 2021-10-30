package com.pb.gershgorin.hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static String FirstCharUp (String s)
    {
        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        s = new String(chars);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Введите строку из нескольких слов:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(FirstCharUp(s));
    }
}
