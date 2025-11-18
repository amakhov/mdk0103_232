package oop.phones;
/*
Основные принципы ООП
- Инкапсуляция - сокрытие реализации
-- это свойство системы, позволяющее объединить
данные и методы в классе, скрыть детали реализации
от пользователя, открыть только то, что необходимо
при последующем использование

- Наследование
-- создание новой сущности на базе уже существующей.

- Полиморфизм
-- возможность иметь разные формы для одной и той же сущности

- Абстракция
-- это способ выделить набор общих характеристик объекта
 */
public class SomePhone {
    private int year;
    private String company;

    public SomePhone(int year1, String company1) {
        year = year1;
        company = company1;
    }

    public void openConnection() {

    }

    public void call() {
        openConnection();
        System.out.println("Вызываю номер");
    }

    public void ring() {
        System.out.println("Дзынь!");
    }
}
