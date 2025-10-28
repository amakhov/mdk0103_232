package lesson3;

public class Download {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Загружено ... 0%");
        for (int i = 5; i < 101; i++) {
            Thread.sleep(50);
            System.out.print("\rЗагружено ... " + i + "%");
        }
    }
}
