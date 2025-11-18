package algorythym.array;
/*
в ООП
1. Cоздаем массив на произвольное кол-во элементов
2. Запол няем случайным числами от 10 до 100
3. Реализовать удаление , добавление элемента
4. Вывод итогово массива

 */
public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = new int[100];

        // массив на 10 элементов
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[8] = 66;
        arr[9] = 33;
        // вывод массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // поиск (66)
         int searchKey = 34;
        for (int i = 0; i < arr.length; i++) {
            if (searchKey == arr[i]) {
                System.out.println("Элемент " + searchKey + " нашелся");
                break;
            }
            if (searchKey != arr[99]) {
                System.out.println("Элемент не найден");
            }
        }

        // удаление элемента




    }
}
