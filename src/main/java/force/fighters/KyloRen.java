package force.fighters;

import sith.weapons.IWeapon;

import java.util.Random;

public class KyloRen extends Fighter {

    private int rage;

    public KyloRen(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
        this.rage = 0;
    }

    public void canStartToRage() {
        Random rand = new Random();
        int amountOfRage = rand.nextInt(100);
        this.rage += amountOfRage;
    }

    public int getRage() {
        return rage;
    }

    public String speak() {
        return " We're not done yet.";
    }
}
