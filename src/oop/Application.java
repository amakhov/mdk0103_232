package oop;

import oop.bookshelf.Author;
import oop.bookshelf.Book;

public class Application {
    public static void main(String[] args) {
        // объект класса Author / экземпляр класса Author
        Author author1 = new Author("Jack", "London");
        Author author2 = new Author("Артур", "Морган");
        Author author3 = new Author("Александр", "Пушкин");

//        author1.name = "Jack";
//        author1.surname = "London";

        author1.printFullName();

//        author2.name = "Артур";
//        author2.surname = "Морган";

        Book book1 = new Book(author3, "Сказки", 100);
        Book book2 = new Book(author2, "Дневник Артура Моргана", 8);



    }
}
/*
ООП (Объектно-ориентированное программирование) -
это методология, основанная на представлении программы как
совокупность взаимодействующих объектов.

Класс - это описание (еще не созданного объекта),
как бы общий шаблон, состоящий из полей (переменные),
методов и конструктора.

Объект

3-4 принципа ООП

Метод
Конструктор
 */