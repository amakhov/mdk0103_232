package lesson3;

import java.util.Scanner;

public class PIN_Code {
    public static void main(String[] args) {
        // 4-значное число от 1000 до 9999
        Scanner scanner = new Scanner(System.in);
        int pin;
        do {
            System.out.println("Введите PIN-код: ");
            pin = scanner.nextInt();
        } while (pin < 1000 || pin > 9999);
        System.out.println("ваш pin принят");
    }
}
