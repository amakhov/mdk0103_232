package oop.interfaces;

public interface IAuthorization {
    // интерфейс может содержать абстрактные методы
    // интерфейс это некий контракт
    // интерфейс не может содержать обычные методы с реализацией, свойства, конструкторов

    String getLogin();
    String getPassword();

    // default методы с реализацией
    default void enterInfo(String message) {
        System.out.println("Авторизация прошла " +  message + getLogin());
    }

    // static методы с реализацией
    static void staticVoid() { // вызов метода - IAuthorization.staticVoid();
        System.out.println("staticVoid");
    }
}
