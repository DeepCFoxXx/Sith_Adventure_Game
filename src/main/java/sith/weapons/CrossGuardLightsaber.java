package sith.weapons;

import enemies.Enemy;

public class CrossGuardLightsaber implements IWeapon {

    public void attack(Enemy enemy){
        enemy.takeDamage(180);
    }

}
