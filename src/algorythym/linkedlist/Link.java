package algorythym.linkedlist;

public class Link {
    public int iData; // данные integer
    public double dData; // данные double
    public Link next; // след. элемент в списке

//    public Link(int id, double dd) {
//        iData = id;
//        dData = dd;
//    }

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }

    // вывод содержимого элемента
    public void printLink() {
        System.out.println(iData + " " + dData);
    }

    public void printList() {
        Link curent = this;
        while (curent != null) {
            curent.printLink();
            curent = curent.next;
        }
    }



}
