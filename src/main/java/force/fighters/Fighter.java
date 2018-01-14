package force.fighters;

import enemies.Enemy;
import players.Player;
import sith.weapons.IWeapon;

public abstract class Fighter extends Player {

    private  IWeapon weapon;

    public Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        this.weapon.attack(enemy);
    }
}
