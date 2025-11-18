package algorythym.l3_objects;

public class Person {
    // поля
    String name;
    String surname;
    int age;
    // конструктор
    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    // методы
    public void display () {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
    }
}
