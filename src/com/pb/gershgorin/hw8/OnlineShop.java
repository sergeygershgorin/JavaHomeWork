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
            String loginLogin = scan.nextLine();
            System.out.println("Введите пароль");
            String passwordLogin = scan.nextLine();
            auth.signIn(loginLogin, passwordLogin);
        } catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
        }
    }
}