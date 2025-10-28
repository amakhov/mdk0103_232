package lesson2;

import java.util.Scanner;

public class Lesson_If {
    // Условный оператор if-else
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Введите ваш возраст: ");
         int age = sc.nextInt();
//        // == - равно (= - это присвоение. == - сравнение)
//        // != - не равно
//        // >=, <= -
        if (age >= 18) {
            System.out.println("Доступ разрешен!");
        } else {
            System.out.println("Вам еще нет 18!");
        }





    }
}
