package lesson3;

import java.util.Random;
import java.util.Scanner;

public class RocketTask {
    // Запустили ракету в космос. Она бесконечно летает по орбите.
    // Чтобы вернуться домой на Землю, нужно ввести секретный код ( 0 - 10), который
    // обновляется после каждого круга.
    // Пилоту нужно отгадать код, чтобы вернуться на Землю.
    public static void main(String[] args) {
        int secretCode;
        int pilotInput;
        int attempt = 5;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            secretCode = random.nextInt(10);
            System.out.println("Ракета начала новый круг по орбите!");
            pilotInput = scanner.nextInt();
            if (secretCode == pilotInput) {
                System.out.println("Поздравляем! Мы летим домой!");
                break; // выход из цикла
            }
            attempt--;
            System.out.println("Осталось " + attempt + " попыток");
            if (attempt == 0) {
                System.out.println("Сработала система самоуничтожения");
                System.exit(0); //
            }
        }
    }
}
