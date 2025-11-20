package game.base;

abstract public class BattleUnit extends Unit {
    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore) {
        super(healthScore);
        if (attackScore < 1 ) {
            throw new IllegalArgumentException("AttackScore must be positive");
        }
        this.attackScore = attackScore;
    }

    // абстрактный метод - без реализации
    abstract public void attack(BattleUnit enemy);
}
