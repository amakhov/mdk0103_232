package algorythym.l2_array;

import java.util.Random;

public class MyArray {

    // переменные класса
    private int[] array; // внутренний массив из Java
    private int counterId = 0; // счётчик индексов

    // это конструктор, получаем размер массива,
    // выделяем память для чисел через системный массив из Java
    public MyArray(int size) {
        this.array = new int[size]; // инициализируем массив
    }

    // метод для получения размера всего массива
    public int getSize() {
        return this.array.length;
    }

    // метод для получения числа свободных элементов массива
    public int getRemainingSize() {
        return this.array.length-this.counterId;
    }

    // метод для получения числа занятых элементов массива
    public int getBusySize() {
        return this.counterId;
    }

    // метод для заполнения массива случайными числами
    // получаем число элементов, которые должны сгенерироваться
    // случайно
    public void fillWithRandomValues(int amount) {
        // создаём объект класса Random,
        // чтобы генерировать псевдо-случайные числа
        Random random = new Random();

        // проходимся по требуемым элементам массива,
        // заполняем их случайными числами
        for (int i = 0; i < amount; i++) {
            int randomValue = random.nextInt(10, 91); // от 10 до 100
            this.array[this.counterId] = randomValue;
            this.counterId++;
        }
    }

    // метод для добавления элемента в массив
    public void addItem(int value) {
        this.array[this.counterId] = value;
        this.counterId++;
    }

    // метод для удаления элемента из масива
    public void removeItem(int value) {
        // проходимся по массиву, ищем первый элемент,
        // равный аргументу value
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == value) {
                // это элемент, который нужно удалить

                // проходимся по оставшимся элементам,
                // сдвигаем их влево
                //
                // цикл "for (int i = 0; i < 10; i++)"
                // будет работать с 0 по 9. Потому что
                // условие i < 10 не срабатывает на 10 итерацию
                // поэтому последний элемент массива
                // (this.array.length-1) не будет задет
                // этим циклом
                for (int j = i; j < this.array.length-1; j++) {
                    this.array[j] = this.array[j+1];
                    // устанавливаем текущий элемент в
                    // значение следующего
                }
                // обнуляем последний элемент массива
                // при длине массива 5, последний индекс - 4
                // потому что считаем от 0, а не от 1
                // поэтому делаем -1
                this.array[this.array.length-1] = 0;

                // декрементируем счётчик
                this.counterId--;
                break;
            }
        }
    }

    // метод для вывода массива в консоль
    public void print() {
        // выводим информирующую строку
        System.out.println("Данные в массиве: ");

        // проходимся по всему массиву
        for (int i = 0; i < this.array.length; i++) {
            // добавляем элемент массива к
            // текущей строке вывода
            System.out.printf("%d ", this.array[i]);
        }
        // выводим пустую строку
        System.out.println();
    }
}
