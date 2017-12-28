package players.fighters;

import players.Player;
import sith.weapons.IWeapon;

public abstract class Fighter extends Player {

    private  IWeapon weapon;

    public Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
}
