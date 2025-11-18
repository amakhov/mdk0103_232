package algorythym.l3_objects;

public class Lesson3Objects {
    public static void main(String[] args) {
        Person person1 = new Person("Артур", "Морган", 35);
        Person person2 = new Person("Макс", "Казаков", 17);
        Person person3 = new Person("Пр", "Патапим", 0);

        person2.display();
        person3.display();

    }
}
