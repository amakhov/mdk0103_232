package oop.interfaces;

/*
Класс User реализует (или имплементирует) интерфейс IUser
класс (если он неабстрактный) обязан реализовать все методы интерфейса
класс может переопределить default методы интерфейса
класс может реализовать более одного интерфейса
 */

public class User implements IUser, IAuthorization {
    @Override
    public String getLogin() {
        return "login";
    }

    @Override
    public String getPassword() {
        return "password";
    }

    @Override
    public void enterInfo(String message) {
        IUser.super.enterInfo(message);
    }

    @Override
    public String getUserName() {
        return "";
    }

    @Override
    public String getToken(byte[] s) {
        return "";
    }
}
