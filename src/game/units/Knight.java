package game.units;

import game.base.BattleUnit;

public class Knight extends BattleUnit {
    private double protection;

    public Knight(int healthScore, int attackScore, double protection) {
        super(healthScore, attackScore);
        if (protection < 0 || protection > 1) {
            throw new IllegalArgumentException("неверные значение (must от 0 до 1)");
        }
        this.protection = protection;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Рыцарь атакует врага!");
        enemy.damage(this.attackScore);
    }

    @Override
    public void damage(int amount) {
        if (!this.isAlive()) return;

        // для рыцаря учитываем защиту
        this.healthScore -= (int) ((1 - protection) * amount);

        if (this.healthScore <= 0) {
            this.healthScore = 0;
            this.broadcastDeath();
        }
    }

    @Override
    protected void broadcastDeath() {
        System.out.println("Рыцарь умер");
    }
}
