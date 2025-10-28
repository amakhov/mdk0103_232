package lesson2;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        // Доброе утро - 5 - 11 часов
        // Добрый день - 12 - 15 часов
        // Добрый вечер - 16 - 22 часов
        // Доброй ночи - 23-24, 0 - 4 часов
        int hour;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите час: ");
        hour = scanner.nextInt();
        // && - и
        // || - или
        if ((hour >= 5) && (hour < 12)) {
            System.out.println("Доброе утро!");
        } else if ((hour >= 12) && (hour <= 15)) {
            System.out.println("Добрый день");
        } else if ((hour >= 16) && (hour <= 23)) {
            System.out.println("Добрый вечер");
        } else if ((hour >= 0) && (hour <= 24)){
            System.out.println("Доброй ночи");
        } else if (hour > 24){
            System.out.println("Невалидное значение");
        }
    }
}
