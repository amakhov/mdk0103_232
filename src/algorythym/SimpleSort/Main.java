package algorythym.SimpleSort;

public class Main {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(6);
        array.add(100);
        array.add(40);
        array.add(140);
        array.add(150);
        array.add(42);
        array.add(2);

        array.print();
        array.bubbleSort();
        System.out.println();
        array.print();
    }
}
