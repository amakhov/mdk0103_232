package algorythym.stack;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.add(20);
        stack.add(42);
        stack.add(33);
        stack.add(50);
        stack.add(99);
        stack.add(234);
        stack.add(2);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
