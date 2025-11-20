package game.base;

// нельзя создать экземпляр (объект) abstract класса
abstract public class Unit {
    /*
    1. поля
    2. конструктор(ы)
    3. методы
     */
    // protected - доступ к дочерним классам или внутри пакета
    protected int healthScore;
    private int maxHealthScore;

    public Unit(int healthScore) {
        if (healthScore < 1) {
            throw new IllegalArgumentException("healtScore должно быть больше 1");
        }
        this.healthScore = healthScore;
        maxHealthScore = healthScore;
    }

    public boolean isAlive() {
        return healthScore > 0;
    }

    // метод получения урона
    public void damage(int amount)
    {
        if (!this.isAlive()) return;

        this.healthScore -= amount;

        if (this.healthScore <= 0) {
            this.healthScore = 0;
            this.broadcastDeath();
        }
    }

    // метод объявления о смерти персонажа
    protected abstract void broadcastDeath();

}
