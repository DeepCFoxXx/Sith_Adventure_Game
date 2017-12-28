package players.fighters;

import sith.weapons.IWeapon;

public class DarthMaul extends Fighter {

    private int speed;

    public DarthMaul(String name, int health, IWeapon weapon, int speed) {
        super(name, health, weapon);
        this.speed = speed;
    }

}
