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
    public void damage(int amount) {
        if (!this.isAlive()) return;

        this.healthScore -= amount;

        if (this.healthScore <= 0) {
            this.healthScore = 0;
            this.broadcastDeath();
        }
    }

    @Override
    protected void broadcastDeath() {
        System.out.println("Король умер");
    }
}
