package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LessonArrayList {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Max", 24);
        Student student2 = new Student(2, "Anna", 20);
        Student student3 = new Student(3, "Paul", 18);
        Student student4 = new Student(4, "Helene", 22);
        Student student5 = new Student(5, "Alex", 23);
        Student student6 = new Student(6, "Ivan", 19);

        /*
        ArrayList
        реализован на основе массива,
        можно хранить null
        можно хранить дублирующиеся элементы
        порядок хранения элементов соответсвует порядку добавления
         */

        ArrayList<Student> studentsList; // на 10 элементов
        studentsList = new ArrayList<>(30); // на указа. кол-во элементов

        // добавление элементов
        studentsList.add(student1); // 0
        studentsList.add(student2); // 1
        studentsList.add(0, student5);
        studentsList.add(1, student3); // замена элемента по индексу
        /*
        обращение к несуществующему индексу списка приведет к
        IndexOutOfBoundException
         */

        // кол-во элементов в коллекции (метод size)
        System.out.println(studentsList.size());

        // получение элементов по индексу (метод get)
        System.out.println(studentsList.get(1));

//        // удаление (метод remove)
//        Student remove = studentsList.remove(0);
//        System.out.println(remove);

        boolean result = studentsList.remove(student1);
        System.out.println(result);

        studentsList.clear(); // удаляет все элементы коллекции

        /*
        LinkedList: интерфейсы List, Deque (Queue)
        двухнаправленный связный список
        можно хранить null
        можно хранить дублирующиеся элементы
        порядок хранения элементов соотвествует порядку добавления
        нельзя задать первоначальную емкость и уменьшить емкость по размеру
         */

        LinkedList<Student> linkedListStudents = new LinkedList<>();
        linkedListStudents.add(student1);
        linkedListStudents.addLast(student4); // добавить в конец
        linkedListStudents.addFirst(student3); // добавить в начало

        // Причины выбрать LinkedList
        /*
        - задачи, где нужно вставлять или удалять  элементы из начала списка,
        с большим количеством вставок и удалений из середины списка
         */
        // когда выбираем ArrayList
        /*
        -каждый новый элемент в LinkedList занимает в памяти больше места, чем новый
        элемент в ArrayList
        - узлы в LL могут храниться в оперативной памяти хаотично, а в AL расположены
        в памяти компьютера последовательно
         */


    }
}
