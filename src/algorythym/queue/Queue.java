package algorythym.queue;

public class Queue {
    private int[] queueArray;
    private int size;
    private int lastIndex;

    public Queue(int size) {
        this.size = size;
        this.queueArray = new int[this.size];
        this.lastIndex = 0;
    }

    // вставка (в конец очереди)
    public void add(int value) {
        if (this.lastIndex >= this.size) {
            throw new RuntimeException("Очередь полна");
        }
        this.queueArray[this.lastIndex++] = value;
    }

    // извлечение (самый первый) + смещение
    public int take() {
        if (this.lastIndex <= 0) {
            throw new RuntimeException("Очередь пуста");
        }

        // берём первый элемент из очереди
        int value = this.queueArray[0];

        // смещаем оставшиеся элементы левее
        for (int i = 0; i < this.size - 1; i++) {
            this.queueArray[i] = this.queueArray[i+1];
        }
        this.lastIndex--;

        return value;
    }

    public boolean isEmpty() {
        return this.lastIndex <= 0;
    }

    public boolean isFull() {
        return this.lastIndex >= this.size;
    }
}
