package oop.interfaces;

public class Admin implements IAuthorization, IUser{
    @Override
    public String getLogin() {
        return "";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void enterInfo(String message) {
        IAuthorization.super.enterInfo(message);
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
