package homework;

import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberComputer = random.nextInt(100);
        int attemp = 3;
        while (attemp > 0) {
            System.out.println("Введите число: ");
            int user_number = scanner.nextInt();
            if (numberComputer == user_number) {
                System.out.println("Вы угадали!");
                return;
            } else if (numberComputer < user_number) {
               System.out.println("Загаданное число меньше");

            } else if (numberComputer > user_number) {
                System.out.println("Загаданное число больше");
            }
            attemp--;
            if (attemp == 0) {
                System.out.println("Вы проиглали, Загаданное число было " + numberComputer);
            }

        }
    }
}
