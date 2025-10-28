package lesson3;

public class CountDown {
    public static void main(String[] args) {
        int countDown = 10;
        while (countDown >= 0) {
            System.out.println("До старта осталось " + countDown + "секунд");
            countDown--;
        }
        System.out.println("Полетели!!!");
    }
}
