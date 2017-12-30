package summons;

import enemies.Enemy;

public class DeathStar implements ISummons{

    private int damage;

    public DeathStar(){
        this.damage = 1000;
    }

    public void summon(Enemy enemy) {
        enemy.takeDamage(damage);
    }

}
