package fighters_test;


import enemies.Enemy;
import enemies.Yoda;
import force_healer.ForceHeal;
import force_healer.Regen;
import org.junit.Before;
import org.junit.Test;
import force.fighters.DarthVader;
import sith.weapons.CrossGuardLightsaber;
import sith.weapons.IWeapon;
import sith.weapons.Lightsaber;

import static org.junit.Assert.assertEquals;

public class DarthVaderTest {

    DarthVader darthVader;
    Enemy enemy;
    IWeapon lightsaber;
    IWeapon crossGuardLightsaber;
    Regen regen;

    @Before
    public void before(){
      lightsaber = new Lightsaber();
      crossGuardLightsaber = new CrossGuardLightsaber();
      darthVader = new DarthVader("Darth Vader", 1000, lightsaber, 100);
      enemy = new Yoda(50, 300, "Yoda");
    }

    @Test
    public void hasName() {
        assertEquals("Darth Vader", darthVader.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(1000, darthVader.getHealth());
    }

    @Test
    public void hasArmour() {
        assertEquals(100, darthVader.getArmour());
    }

    @Test
    public void canSpeak() {
        assertEquals("I am altering the deal, pray I do not alter it any further…", darthVader.speak());
    }

    @Test
    public void canSwapWeapons() {
        darthVader.setWeapon(crossGuardLightsaber);
        darthVader.attack(enemy);
        assertEquals(120, enemy.getHealth());
    }

    @Test
    public void canTakeDamage() {
        darthVader.takeDamage(50);
        assertEquals(950, darthVader.getHealth());
    }

    @Test
    public void canAttack() {
        darthVader.attack(enemy);
        assertEquals(150, enemy.getHealth());
    }

    @Test
    public void enemyHasName() {
        assertEquals("Yoda", enemy.getName());
    }

    @Test
    public void enemyHasHealth() {
        assertEquals(300, enemy.getHealth());
    }

    @Test
    public void enemyHasAttack() {
        assertEquals(50, enemy.getAttack());
    }

    @Test
    public void canHeal() {
        regen = new ForceHeal();
        darthVader.heal(50);
        assertEquals(1050, darthVader.getHealth());
    }
}
