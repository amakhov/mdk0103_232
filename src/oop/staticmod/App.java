package oop.staticmod;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] buses = {374, 390, 326, 330, 335};
        System.out.println(Arrays.toString(buses));

//        Util util1 = new Util();
        Util.min = 200;
        System.out.println(Util.PI);
        System.out.println(Util.random(5,63));
    }
}
