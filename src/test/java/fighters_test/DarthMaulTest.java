package fighters_test;

import enemies.Enemy;
import enemies.MaceWindu;
import org.junit.Before;
import org.junit.Test;
import players.fighters.DarthMaul;
import sith.weapons.DoubleBladedLightsaber;
import sith.weapons.IWeapon;
import sith.weapons.Lightsaber;

import static org.junit.Assert.assertEquals;

public class DarthMaulTest {

    DarthMaul darthMaul;
    Enemy enemy;
    IWeapon doubleBladedLightsaber;
    IWeapon lightsaber;

    @Before
    public void before() {
        doubleBladedLightsaber = new DoubleBladedLightsaber();
        lightsaber = new Lightsaber();
        darthMaul = new DarthMaul("Darth Maul", 550, doubleBladedLightsaber, 30);
        enemy = new MaceWindu(100, 500);
    }

    @Test
    public void hasName() {
        assertEquals("Darth Maul", darthMaul.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(550, darthMaul.getHealth());
    }
}
