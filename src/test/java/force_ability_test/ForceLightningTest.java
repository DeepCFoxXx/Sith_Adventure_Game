package force_ability_test;

import enemies.Enemy;
import enemies.MaceWindu;
import force_users.force_powers.ForceLightning;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForceLightningTest {

    ForceLightning forceLightning;
    Enemy enemy;

    @Before
    public void before() {
        forceLightning = new ForceLightning();
        enemy = new MaceWindu(100, 500, "Mace Windu");
    }

    @Test
    public void canUse() {
        forceLightning.use(enemy);
        assertEquals(400, enemy.getHealth());
    }

    @Test
    public void enemyHasName(){
        assertEquals("Mace Windu", enemy.getName());
    }

    @Test
    public void enemyHasAttack(){
        assertEquals(100, enemy.getAttack());
    }

    @Test
    public void enemyHasHealth(){
        assertEquals(500, enemy.getHealth());
    }

}
