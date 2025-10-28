package lesson4;

public class ForEach {
    public static void main(String[] args) {
        // цикл for-each, проход по всем элементам массива
        // цикл специально для массива
        int[] scores = new int[] {44,22,63,72,347,332,337,332,221,774,111,44,2,0};
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            System.out.println("Баллы: " + score);
        }

        int sum = 0;
        for(int score: scores) {
            sum += score; // sum = sum + score;
        }
        System.out.println("Сумма всех балов: " + sum);

        // если нужен индекс или требуется изменять элементы - цикл for
        // если просто пройтись по значениям - for-each

        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("Максимальный балл " + max);

        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("Минимальный балл " + min);
        double average = (double) sum / scores.length;
        System.out.println("Средняя оценка " + average);
    }
}
