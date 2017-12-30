package summons;

import enemies.Enemy;

public class SuperStarDestroyer implements ISummons{

    private int damage;

    public SuperStarDestroyer(){
        this.damage = 600;
    }

    public void summon(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
