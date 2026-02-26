package oop.interfaces.messenger;

public class Client {
//    private WhatsApp whatsApp;
//    private Telegram telegram;
//    private Max max;
    private IMessenger messenger;

    // Сеттер, метод который устанавливает клиенту мессенджер
    public void setMessenger(IMessenger messenger) {
        this.messenger = messenger;
    }

    // метод для отправки сообщения от имени клиента через выбранный мессенджер
    public void sendMessage() {
        if(messenger != null) {
            messenger.sendMessage();
        } else {
            System.out.println("Мессенджер не установлен!");
        }
    }
}
