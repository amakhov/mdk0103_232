package algorythym.SimpleSort;

public class ArrayBubble {
    /*
    время выполения пузырьковой сортировки составляет О(n*2)
    (в средней и худшем случаи)
    но если алгоритм опитимизова то будет О(n) - лучшая сложность
    для этого алгоритма
     */


    private int[] a; // ссылка на массив
    private int elems; // кол-во элементов в массиве

    // конструктор класса
    public ArrayBubble(int max) {
        a = new int[max]; // создание массива размером max
        elems = 0; // при создание массив содержит 0
    }

    // метод вставки элемента в массив
    public void add(int value) {
        a[elems] = value; // вставка value в массив a
        elems++;
    }

    // метод вывода массива
    public void print() {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void swap(int first, int second) {
        int third = a[first];
        a[first] = a[second];
        a[second] = third;
    }

    // метод пузырьковой сортировки
    public void bubbleSort() {
        for (int out = elems - 1; out >= 1; out--) { // внешний цикл
            for (int in = 0; in < out; in++) { // внутренний цикл
                if (a[in] > a[in+1]) { // если порядок нарушен,
                    // то вызывается метод swap
                    swap(in, in + 1);
                }
            }
        }
    }

}
