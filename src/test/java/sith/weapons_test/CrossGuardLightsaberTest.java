package sith.weapons_test;

import enemies.Enemy;
import enemies.Rey;
import org.junit.Before;
import org.junit.Test;
import sith.weapons.CrossGuardLightsaber;

import static org.junit.Assert.assertEquals;

public class CrossGuardLightsaberTest {

    CrossGuardLightsaber crossGuardLightsaber;
    Enemy enemy;

    @Before
    public void before(){
        crossGuardLightsaber = new CrossGuardLightsaber();
        enemy = new Rey(120, 600, "Rey");
    }

    @Test
    public void canDamage(){
        crossGuardLightsaber.attack(enemy);
        assertEquals(420, enemy.getHealth());
    }
}
