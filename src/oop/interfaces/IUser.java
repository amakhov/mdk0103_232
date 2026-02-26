package oop.interfaces;

public interface IUser {
    default void enterInfo(String message) {
        System.out.println("Авторизованный пользователь");
    }

    String getUserName();
    String getToken(byte[] s);
}
