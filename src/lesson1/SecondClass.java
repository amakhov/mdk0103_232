package lesson1;

import javax.swing.*;

public class SecondClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Dekstop");
        JLabel label = new JLabel("Hello Dekstop", JLabel.CENTER);
        frame.add(label);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
