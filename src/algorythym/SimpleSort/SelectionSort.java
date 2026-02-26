package algorythym.SimpleSort;

public class SelectionSort {
    private int[] a;
    private int elems;

    public SelectionSort(int max) {
        a = new int[max];
        elems = 0;
    }

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

    // сортировка методом выбора
    public void selectionSort() {
        for (int out = 0; out < elems; out++) { // внешний цикл
            int min = out; // минимум
            for (int in = out + 1; in < elems; in++) { // внутренний цикл
                if(a[in] < a[min]) // если min больше, значит устанавливаем новый минимум
                    min = in;
            swap(out, min);
            }
        }
    }
}
