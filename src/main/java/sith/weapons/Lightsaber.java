package sith.weapons;

import enemies.Enemy;

public class Lightsaber implements IWeapon {

    public void attack(Enemy enemy){
        enemy.takeDamage(150);
    }

}
