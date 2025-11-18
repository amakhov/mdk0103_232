package oop.bookshelf;

public class Book {
    // автор, название, кол-во страниц
    private Author author;
    private String title;
    private int pageCount;
    // private позволяет обращаться к свойствам и методам
    // только из текущего класса

    public Book(Author author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        if (pageCount <= 10) {
            System.out.println("Нельзя создать книгу меньше чем 10 страниц");
            return;
        }
        this.pageCount = pageCount;
    }


}
