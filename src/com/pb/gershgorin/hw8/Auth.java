package com.pb.gershgorin.hw8;

public class Auth {
    protected String login;
    protected String password;

    public void signUp (String login, String password, String passwordConfirm) throws WrongLoginException, WrongPasswordException
    {
        boolean loginApproved = false;
        boolean passwordApproved = false;
        if (login.length() >= 5 && login.length() <= 20 && login.matches("^[a-zA-Z0-9]+$") ) {
            loginApproved = true;
        } else {
            throw new WrongLoginException("Ошибка! Логин должен быть от 5 до 20 символов, латиница или цифры");
        }
        if (password.length() > 5 && password.matches("^[a-zA-Z0-9_]+$")) {
            passwordApproved = true;
        } else {
            throw new  WrongPasswordException ("Ошибка! Пароль должен быть: не менее 5 символов, латиница, цифры");
        }
        if (password.equals(passwordConfirm) && passwordApproved && loginApproved) {
            this.login = login;
            this.password = password;
        } else {
            throw new  WrongPasswordException ("Ошибка! Введенные пароль и подтверждение не совпадают");
        }
    }

    public void signIn (String login, String password) throws WrongLoginException{
        if (login.equals(this.login) && password.equals(this.password)) {
            System.out.println("Вход на сайт выполнен успешно");
        } else {
            throw new WrongLoginException ("Ошибка при вводе логина или пароля!");
        }

    }
}
