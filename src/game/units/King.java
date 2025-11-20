package game.units;

import game.base.Unit;
/*
класс King наследуется от класса Unit
класс King расширяет класс Unit
класс King - дочерний класс
класс Unit - родительский класс (суперкласс)
 */
public class King extends Unit {

    // конструкторы не наследуются
    public King(int healthScore) {
        super(healthScore); // вызов конструктора родителя
    }

    @Override
    protected void broadcastDeath() {
        System.out.println("Король умер");
    }
}
