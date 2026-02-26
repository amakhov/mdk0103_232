package climbers;

public class Group {
    private boolean isOpen;
    private Climber[] climbers = new Climber[3];
    // [null, null, null]
    // [vasya, null, null]
    private Mountain mountain;

    public Group() {
        isOpen = true;
        if (this.climbers.length > 3) {
            throw new IllegalArgumentException("В группе может быть не более 3-х альпинистов");
          //  System.out.println("В группе может быть не более 3-х" +
          //          "альпинистов");
        }
    }

    // добавить альпиниста
    public void addClimber(Climber climber){
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null) {
                climbers[i] = climber;
                return;
            }
        }
        System.out.println("Набор в группу закрыт");
    }

    // вывести альпинистов в группе
    public void displayClimbers(){
        for (int i = 0; i < climbers.length; i++) {
            System.out.println(climbers[i] + " ");

        }
    }

    // добавить гору
    public void addMountain(Mountain mountain) {
        this.mountain = mountain;
    }

}
 