package sith.weapons_test;

import enemies.Enemy;
import enemies.Finn;
import org.junit.Before;
import org.junit.Test;
import sith.weapons.Lightsaber;

import static org.junit.Assert.assertEquals;

public class LightsaberTest {

    Lightsaber lightsaber;
    Enemy enemy;

    @Before
    public void before(){
        lightsaber = new Lightsaber();
        enemy = new Finn(40, 250, "Finn");
    }

    @Test
    public void canDamage(){
        lightsaber.attack(enemy);
        assertEquals(100, enemy.getHealth());
    }

}
