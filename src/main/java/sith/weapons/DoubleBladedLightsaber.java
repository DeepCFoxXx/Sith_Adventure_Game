package sith.weapons;

import enemies.Enemy;

public class DoubleBladedLightsaber implements IWeapon {

    public void attack(Enemy enemy){
        enemy.takeDamage(250);
    }

}
