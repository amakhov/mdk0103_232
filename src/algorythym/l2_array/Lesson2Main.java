package algorythym.l2_array;

/*
в ООП
1. Cоздаем массив на произвольное кол-во элементов
2. Заполняем случайным числами от 10 до 100
3. Реализовать удаление , добавление элемента
4. Вывод итогово массива

 */
public class Lesson2Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(100);
        myArray.fillWithRandomValues(20);

        myArray.addItem(500);
        myArray.addItem(-1000);
        myArray.addItem(200);
        myArray.addItem(20);
        myArray.addItem(20);
        myArray.addItem(50);
        myArray.removeItem(20);

        myArray.print();

        MyArray myArray2 = new MyArray(10);
        myArray2.fillWithRandomValues(5);

        myArray2.print();
    }
}
