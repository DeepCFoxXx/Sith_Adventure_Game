package force_users_test;

import enemies.Enemy;
import enemies.MaceWindu;
import force_users.force_power_users.DarthSidious;
import force_users.force_powers.ForceLightning;
import force_users.force_powers.ForcePush;
import org.junit.Before;
import org.junit.Test;
import summons.DeathStar;
import summons.SuperStarDestroyer;

import static org.junit.Assert.assertEquals;

public class DarthSidiousTest {

    DarthSidious darthSidious;
    Enemy enemy;
    ForceLightning forceLightning;
    ForcePush forcePush;
    DeathStar deathStar;
    SuperStarDestroyer superStarDestroyer;

    @Before
    public void before() {
        darthSidious = new DarthSidious("Darth Sidious", 400, forceLightning, deathStar);
        enemy = new MaceWindu(100, 500, "Mace Windu");
        forceLightning = new ForceLightning();
        forcePush = new ForcePush();
        deathStar = new DeathStar();
        superStarDestroyer = new SuperStarDestroyer();
    }

    @Test
    public void hasName() {
        assertEquals("Darth Sidious", darthSidious.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(400, darthSidious.getHealth());
    }

//    @Test
//    public void canUseForce() {
//        darthSidious.use(enemy);
//        assertEquals(400, enemy.getHealth());
//    }
//
//    @Test
//    public void canChangeForcePower() {
//        darthSidious.setForcePower(forcePush);
//        darthSidious.use(enemy);
//        assertEquals(430, enemy.getHealth());
//    }
//
//    @Test
//    public void canSummon() {
//        darthSidious.summon(enemy);
//        assertEquals(-500, enemy.getHealth());
//    }

//    @Test
//    public void canChangeSummons() {
//        darthSidious.setSummons();
//        darthSidious.summon(enemy);
//        assertEquals(-300, enemy.getHealth());
//    }
    @Test
    public void enemyHasName() {
    assertEquals("Mace Windu", enemy.getName());
    }

    @Test
    public void enemyHasHealth() {
        assertEquals(500, enemy.getHealth());
    }

    @Test
    public void enemyHasAttack() {
        assertEquals(100, enemy.getAttack());
    }
}
