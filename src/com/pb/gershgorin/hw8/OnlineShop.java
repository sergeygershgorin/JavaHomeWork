package com.pb.gershgorin.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth  = new Auth();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Придумайте логин");
            String login = scan.nextLine();
            System.out.println("Придумайте пароль");
            String password = scan.nextLine();
            System.out.println("Подтвердите пароль");
            String passwordConfirm = scan.nextLine();

            auth.signUp(login, password, passwordConfirm);

            System.out.println(System.lineSeparator() +"Для входа на сайт ведите логин");
            String login_1 = scan.nextLine();
            System.out.println("Введите пароль");
            String password_1 = scan.nextLine();

            auth.signIn(login_1, password_1);
        } catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
        }
    }
}