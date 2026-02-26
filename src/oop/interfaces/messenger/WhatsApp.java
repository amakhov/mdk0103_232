package oop.interfaces.messenger;

import oop.interfaces.IAuthorization;

public class WhatsApp implements IMessenger, IApplication, IAuthorization {
    @Override
    public void sendMessage() {
        System.out.println("Отправлено сообщение из WhatsApp");
    }

    @Override
    public void getMessage() {
        System.out.println("Получено сообщение из WhatsApp");
    }

    @Override
    public String getLogin() {
        return "";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void openApp() {

    }

    @Override
    public void deleteApp() {

    }
}
