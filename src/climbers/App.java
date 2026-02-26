package climbers;

public class App {
    public static void main(String[] args) {
        Climber vasya = new Climber("Вася", 20);
        Climber petya = new Climber("Petya", 25);
        // 5 альпинистов
        // объекты гор

        Mountain mountain1 = new Mountain("Everest", "Russia", 4684);
        Mountain mountain2 = new Mountain("Himalayas", "China", 6763);

        Group groupEverest = new Group();
        groupEverest.addMountain(mountain1);
        groupEverest.addClimber(vasya);
        groupEverest.addClimber(petya);
        groupEverest.addClimber(vasya);
        groupEverest.addClimber(vasya);
        groupEverest.displayClimbers();
    }
}
