package lesson4;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5]; // создали массив на 10 элементов
        // ввод
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите слово: ");
            arr[i] = scanner.nextLine();
        }

        // вывод (в обратном порядке)
        for(int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}
