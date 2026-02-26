package oop.interfaces.messenger;

public class Max implements IMessenger{
    @Override
    public void sendMessage() {
        System.out.println("Отправлено сообщение из Max");
    }

    @Override
    public void getMessage() {
        System.out.println("Получено сообщение из Max");
    }
}
