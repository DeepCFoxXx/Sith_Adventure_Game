package summons_test;

import enemies.Enemy;
import enemies.MaceWindu;
import org.junit.Before;
import org.junit.Test;
import summons.DeathStar;

import static org.junit.Assert.assertEquals;

public class DeathStarTest {

    DeathStar deathStar;
    Enemy enemy;

    @Before
    public void before(){
        deathStar = new DeathStar();
        enemy = new MaceWindu(100, 500, "Mace Windu");
    }

    @Test
    public void canSummon(){
        deathStar.summon(enemy);
        assertEquals(-500, enemy.getHealth());
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
