package lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        // ввод с клавиатуры
        // System.in
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя ");
        // переменная.метод
        String name = in.nextLine();
        System.out.print("Введите ваш возраст ");
        int age = in.nextInt();
//        double number2 = console.nextDouble();
//        byte byte1 = console.nextByte();
//        boolean bool = console.nextBoolean();
        System.out.println("Имя " + name);
        System.out.println("Возраст " + age);

    }
}
