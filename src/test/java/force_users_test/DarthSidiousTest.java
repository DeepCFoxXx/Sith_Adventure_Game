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
    MaceWindu maceWindu;
    ForceLightning forceLightning;
    ForcePush forcePush;
    DeathStar deathStar;
    SuperStarDestroyer superStarDestroyer;

    @Before
    public void before() {
        darthSidious = new DarthSidious("Darth Sidious", 400, forceLightning, deathStar);
        maceWindu = new MaceWindu(100, 500, "Mace Windu");
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
//    public void canUseAbility() {
//
//    }

    @Test
    public void canSpeak() {
        assertEquals("Are you threatening me, Master Jedi?", darthSidious.speak());
    }

    @Test
    public void enemyHasName() {
    assertEquals("Mace Windu", maceWindu.getName());
    }

    @Test
    public void enemyHasHealth() {
        assertEquals(500, maceWindu.getHealth());
    }

    @Test
    public void enemyHasAttack() {
        assertEquals(100, maceWindu.getAttack());
    }
}
