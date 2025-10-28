package lesson3;

import java.util.Scanner;

public class LessonDoWhile {
    public static void main(String[] args) {
        /* многострочный комментарий
        do {
        тело цикла (этот код выполняется хотя бы один раз)
        } while (условие);
         */

        // отличие от while
        int count = 0;
        while(count > 0) {
            System.out.println("count " + count);
            count--;
        }

        do {
            System.out.println("count (do-while) " + count);
            count--;
        } while (count>0);
        // выведет count = 0, хотя условие ложно

        String password;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Введите новый пароль (не менее 6 символов");
            password = scanner.nextLine();
        } while (password.length() < 6);
        System.out.println("Пароль принят");

        // Сравнение циклов
        /*
        while - проверка условия (до),
            - используем когда заранее неизвествно количество итераций (повторений)
            - выполняется тело цикло от 0 и более раз
        for - проверка условия (до)
            - когда известно количество итераций
            - выполняется тело цикло от 0 и более раз
        do-while - проверка условия (после
            - выполняется тело цикло от 1 и более раз
         */
    }
}
