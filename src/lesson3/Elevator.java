package lesson3;

public class Elevator {
    // Подъем лифта, где 20-этажный дом, просторная 5-уровняя парковка
    // Отображает каждый этаж
    public static void main(String[] args) {
        int floor;
        for(floor = 20; floor >= -5; floor--) {
            if (floor == 0) {
                continue; // пропуск, возврат к началу цикла
            }
            System.out.println("Этаж №  " + floor);
        }
    }
}
