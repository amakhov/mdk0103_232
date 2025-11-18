package lesson4;

public class LessonArray2 {
    public static void main(String[] args) {
        // двухмерные массивы
        // тип [][] имяМассива;
        int [][] matrix = new int[3][4]; // 3 - строки, 4 - столбца

        // заполнение
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i*3+j+1;
            }
        }

        // вывод
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

        int [][] matrix2 = {
                {2, 5, 5},
                {4, 44, 2},
                {7, 8, 9}
        };
    }
}
