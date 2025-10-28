package lesson3;

public class GymTask {
    // Разработать программу силовой тренировки в зале
    // В тренировке будет 10 кругов
    // на нечетных кругах - 5 отжиманий
    // на четных - 7 приседаний
    // после каждого круга нужно 8 раз покачать пресс
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Круг № " + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= 7; j++) {
                    System.out.println("Приседаем " + j);
                }
            } else {
                for (int j = 1; j <= 5; j++) {
                    System.out.println("Отжимаеся " + j);
                }
            }
            for (int j = 1; j <= 7; j++) {
                System.out.println("Качаем пресс " + j);
            }
        }
    }
}
