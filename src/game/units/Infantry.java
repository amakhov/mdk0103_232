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
    protected void broadcastDeath() {
        System.out.println("Пехотинец умер");
    }
}
