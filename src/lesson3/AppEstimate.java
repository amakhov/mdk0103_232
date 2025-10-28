package lesson3;

import java.util.Scanner;

public class AppEstimate {
    // Пользователю предлагается оценить работу приложения
    // от 1 до 5.
    // Для каждой оценки предусмотрен свой вариант ответа
    // если введены другие цифры - вопрос будет повторяться
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.print("Оценка: ");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.println("Почему такая оценка?");
                break;
            } else if (num == 2) {
                System.out.println("Я не согласен с этой оценкой");
                break;
            } else if (num == 3) {
                System.out.println("Жалко");
                break;
            } else if (num == 4) {
                System.out.println("Окак!");
                break;
            } else if (num == 5) {
                System.out.println("Боже! Какой же я сигма!");
                break;
            }
            System.out.println("Это не оценка");

        }
    }
}
