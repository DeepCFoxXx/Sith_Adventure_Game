package force.fighters;

import sith.weapons.IWeapon;

public class DarthMaul extends Fighter {

    private int speed;

    public DarthMaul(String name, int health, IWeapon weapon, int speed) {
        super(name, health, weapon);
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String speak() {
        return "At last we will reveal ourselves to the jedi";
    }
}
