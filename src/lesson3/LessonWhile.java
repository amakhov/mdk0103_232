package lesson3;

public class LessonWhile {
    // Циклы: while, for, do-while
    //
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;

        int i = 0;
        while (i <= 100) { // while (условие)
            // если условие истинно - то попадаем в тело цикла
            // если ложно - игнорируем
            // тело цикла
            System.out.println("Шаг № " + i);
            i++; // не забываем увеличивать i
            //i = i + 10;
        }

        // бесконечный цикл
//        while (true) {
//            System.out.println("Я вечный");
//        }





    }
}
