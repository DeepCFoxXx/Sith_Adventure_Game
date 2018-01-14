package fighters_test;

import enemies.Enemy;
import enemies.Rey;
import org.junit.Before;
import org.junit.Test;
import force.fighters.KyloRen;
import sith.weapons.CrossGuardLightsaber;
import sith.weapons.IWeapon;
import sith.weapons.Lightsaber;

import static org.junit.Assert.assertEquals;

public class KyloRenTest {

    KyloRen kyloRen;
    Enemy enemy;
    IWeapon crossGuardLightsaber;
    IWeapon lightsaber;

    @Before
    public void before() {
        crossGuardLightsaber = new CrossGuardLightsaber();
        lightsaber = new Lightsaber();
        kyloRen = new KyloRen("Kylo Ren", 600, crossGuardLightsaber);
        enemy = new Rey(120, 600, "Rey");
    }

    @Test
    public void hasName() {
        assertEquals("Kylo Ren", kyloRen.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(600, kyloRen.getHealth());
    }

    @Test
    public void canRage() {
        kyloRen.canStartToRage();
        assertEquals(true, kyloRen.getRage() > 0);
    }

    @Test
    public void canSpeak() {
        assertEquals(" We're not done yet.", kyloRen.speak());
    }

    @Test
    public void canSwapWeapons() {
        kyloRen.setWeapon(lightsaber);
        kyloRen.attack(enemy);
        assertEquals(450, enemy.getHealth());
    }

    @Test
    public void canTakeDamage() {
        kyloRen.takeDamage(120);
        assertEquals(480, kyloRen.getHealth());
    }

    @Test
    public void canAttack() {
        kyloRen.attack(enemy);
        assertEquals(420, enemy.getHealth());
    }

    @Test
    public void enemyHasName() {
        assertEquals("Rey", enemy.getName());
    }

    @Test
    public void enemyHasAttack() {
        assertEquals(120, enemy.getAttack());
    }

    @Test
    public void enemyHasHealth() {
        assertEquals(600, enemy.getHealth());
    }
}
