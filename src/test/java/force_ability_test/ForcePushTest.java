package force_ability_test;

import enemies.Enemy;
import enemies.Yoda;
import force_users.force_powers.ForcePush;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForcePushTest {

    ForcePush forcePush;
    Enemy enemy;

    @Before
    public void before() {
        forcePush = new ForcePush();
        enemy = new Yoda(50, 300, "Yoda");
    }

    @Test
    public void canUse() {
        forcePush.use(enemy);
        assertEquals(230, enemy.getHealth());
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

}
