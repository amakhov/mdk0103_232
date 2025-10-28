package lesson1;

public class FirstClass {
 // горящие клавиши psvm

    // точка входа в программу (главный метод main)
    // psvm - горячие клавиши
    public static void main(String[] args) {
        // вывод на экран
//        System.out.println("Первый " + " ");
//        System.out.println("Второй"); // sout

        /*
        многострочный комментарий

         */
        //Переменные
        // типы данных:
        // 1.целочисленные - byte, short, int, long (5 57 100 ... )
        // 2.числа с плавающей точкой - double, float
        // 3.cимвольный - char
        // 4.логический - boolean (true, false)
        // 5.строка - String

        //объявление переменных
        // типДанных название = значение;
        int number;
        number = 300;
        int number2 = 80;

        System.out.println(number + " + " + number2 + " = "
                + (number + number2));
        System.out.println(number2 - number);

        double number3 = 0.68;
        double number4 = 2.43;
        System.out.println(number4 * number3);

        char symbol = 'g'; // всегда одинарные кавычки
        char symbol2 = '\u2698';
        System.out.println(symbol2);

        boolean isOpen;
        isOpen = true;

        number = 432;
        number2 = 432;
        System.out.println(number4 < number3); // больше (>), меньше (<)
        System.out.println(number2 >= number4); // больше равно (>=), меньше равно (<=);
        System.out.println(number == number2); // равно
        System.out.println(number != number3); // неравно

        String name = "Cаша"; // строка используем двойные кавычки
        System.out.println("Добрый день " + name);

    }
}
