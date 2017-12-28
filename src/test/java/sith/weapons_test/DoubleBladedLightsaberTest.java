package sith.weapons_test;

import enemies.Enemy;
import enemies.MaceWindu;
import org.junit.Before;
import org.junit.Test;
import sith.weapons.DoubleBladedLightsaber;

import static org.junit.Assert.assertEquals;

public class DoubleBladedLightsaberTest {

    DoubleBladedLightsaber doubleBladedLightsaber;
    Enemy enemy;

    @Before
    public void before(){
        doubleBladedLightsaber = new DoubleBladedLightsaber();
        enemy = new MaceWindu(100, 500);
    }

    @Test
    public void canDamage(){
        doubleBladedLightsaber.attack(enemy);
        assertEquals(250, enemy.getHealth());
    }

}
