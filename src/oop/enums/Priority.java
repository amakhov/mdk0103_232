package oop.enums;

/*
Перечисление может создаваться со свойствами, конструкторами, методами

 */

public enum Priority {
    HIGH(10), MIDDLE(5), LOW(1);


    private int code;

    Priority(int code) {
        this.code = code;
    }
}
