package players.fighters;

import sith.weapons.IWeapon;

public class DarthVader extends Fighter {

    private int armour;

    public DarthVader(String name, int health, IWeapon weapon){
        super(name, health, weapon);
        this.armour = armour;
    }

}
