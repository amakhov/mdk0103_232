package climbers;

public class Climber {
    private String name;
    private int age;
    private String address;

    public Climber(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Climber(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Альпинист с " +
                "именем'" + name + '\'' +
                ", возрастом=" + age +
                ", адрес='" + address + '\'' +
                '}';
    }
}
