package algorythym.linkedlist;

public class App {
    public static void main(String[] args) {
        Link link1 = new Link(25, 55.32);
        Link link2 = new Link(50, 40.4);
        Link link3 = new Link(60, 20.3);
        Link link4 = new Link(666, 50.9);
        Link link5 = new Link(99, 55.3);

        link1.next = link2;
        link2.next = link3;
        link3.next = link4;
        link4.next = link5;

        link1.printLink();
        link1.printList();
    }
}
