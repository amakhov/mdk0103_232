package game.units;

import game.base.BattleUnit;

public class Infantry extends BattleUnit {
    private int additionalHealth;

    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Пехотинец атакует врага!");
        enemy.damage(this.attackScore);
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
        System.out.println("Пехотинец умер");
    }
}
