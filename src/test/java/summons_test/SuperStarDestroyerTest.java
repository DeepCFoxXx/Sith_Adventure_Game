package summons_test;

import enemies.Enemy;
import enemies.Finn;
import org.junit.Before;
import org.junit.Test;
import summons.SuperStarDestroyer;

import static org.junit.Assert.assertEquals;

public class SuperStarDestroyerTest {

    SuperStarDestroyer superStarDestroyer;
    Enemy enemy;

    @Before
    public void before() {
        superStarDestroyer = new SuperStarDestroyer();
        enemy = new Finn(40, 250, "Finn");
    }

    @Test
    public void canSummon() {
        superStarDestroyer.summon(enemy);
        assertEquals(-350, enemy.getHealth());
    }

    @Test
    public void enemyHasName() {
        assertEquals("Finn", enemy.getName());
    }

    @Test
    public void enemyHasHealth() {
        assertEquals(250, enemy.getHealth());
    }

    @Test
    public void enemyHasAttack() {
        assertEquals(40, enemy.getAttack());
    }
}
