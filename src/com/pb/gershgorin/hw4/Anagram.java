package com.pb.gershgorin.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static String Compare (String f, String s)
    {
        String result = "";
        f = f.replaceAll("[,.;:]","");
        s = s.replaceAll("[.,;:]","");
        f = f.toLowerCase();
        s = s.toLowerCase();
        char[] first = f.toCharArray();
        char[] second = s.toCharArray();

  /*      for (int i = 0; i < first.length; i++) {
            if (first[i] == ' ') {
                first[i] = '';
            }
            if (first[i] == '.') {
                first[i] = '';
            }
            if (first[i] == ',') {
                first[i] = '';
            }
        }

*/
        Arrays.sort(first);
        Arrays.sort(second);
        if (first.length != second.length) {result = "количество символов не совпадает, это не анаграмма";}
        else
        { if (Arrays.equals(first,second)) {result = "это анаграмма";}
            else {result = "символы не совпадают, это не анаграмма";}

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите две строки:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String f = input.nextLine();
        System.out.println(Compare(f,s));
    }
}
