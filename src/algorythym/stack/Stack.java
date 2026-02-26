package algorythym.stack;

/*
Перестановка букв в слове
Введите слово: size
ezis
 */

/*
Поиск парных скобок
c[d] - правильно
c{s] - неправильно
d(dd} - неправильно
 */

public class Stack {
    // LIFO - Last In First Out (последний пришел, первый ушел)
    private int[] stackArray;
    private int top;
    private int maxSize;

    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = 0;
    }

    // добавить
    public void add(int j) {
        if (top>= maxSize) {
            throw new RuntimeException("stack полон");
        }
        stackArray[top++] = j;
    }

    // извлечение
    public int pop() {
        if (top <= 0) {
            throw new RuntimeException("stack пуст");
        }
        return stackArray[--top];
    }

    public boolean isEmpty() {
        return this.top <= 0;
    }


}
