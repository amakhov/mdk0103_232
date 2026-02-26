package oop.interfaces.messenger;

public class App {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setMessenger(new Telegram());
        client1.sendMessage();
        client1.setMessenger(new Max());
        client1.sendMessage();
    }
}
