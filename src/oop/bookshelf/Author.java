package oop.bookshelf;

public class Author {
    // свойства, характеристик, поля, атрибуты
    // значение свойств по умолчанию
    // для ссылочных типов - null
    // для булевых типов - false
    // целочисленны - 0, с плав. точкой - 0.0
    private String name;
    private String surname;

    // конструктор - метод, который имеет название как у класса
    // во всех классах есть конструкторы

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author() {
        this.name = "Неизвестный";
        this.surname = "Неизвестный";
    }

    // методы
    // void - метод не возвращает
    public void printFullName() {
        // тело метода
        System.out.println(name + " " + surname);
    }

    public String getNameSurname() {
        // return - прерывает работу метода
        // возвращает результат работы метода
        return name + " " + surname;
    }
}
