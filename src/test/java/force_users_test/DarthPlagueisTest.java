package force_users_test;

import enemies.Enemy;
import enemies.Finn;
import force_healer.ForceHeal;
import force_healer.Regen;
import force_users.force_power_users.DarthPlagueis;
import force_users.force_powers.ForceLightning;
import force_users.force_powers.ForcePush;
import org.junit.Before;
import org.junit.Test;
import summons.DeathStar;
import summons.SuperStarDestroyer;

import static org.junit.Assert.assertEquals;

public class DarthPlagueisTest {

    DarthPlagueis darthPlagueis;
    Enemy enemy;
    ForcePush forcePush;
    ForceLightning forceLightning;
    SuperStarDestroyer superStarDestroyer;
    DeathStar deathStar;
    Regen regen;

    @Before
    public void before() {
        darthPlagueis = new DarthPlagueis("Darth Plagueis", 400, forcePush, superStarDestroyer);
        enemy = new Finn(40, 250, "Finn");
        forcePush = new ForcePush();
        forceLightning = new ForceLightning();
        superStarDestroyer = new SuperStarDestroyer();
        deathStar = new DeathStar();
    }

    @Test
    public void canUseAbility() {
        darthPlagueis = new DarthPlagueis("Darth Plagueis", 400, forcePush, superStarDestroyer);
        enemy = new Finn(40, 250, "Finn");
        forcePush = new ForcePush();
        darthPlagueis.use(enemy);
        assertEquals(180, enemy.getHealth());
    }

    @Test
    public void canChangeAbility() {
        darthPlagueis = new DarthPlagueis("Darth Plagueis", 400, forcePush, superStarDestroyer);
        enemy = new Finn(40, 250, "Finn");
        forceLightning = new ForceLightning();
        darthPlagueis.setAbility(forceLightning);
        darthPlagueis.use(enemy);
        assertEquals(150, enemy.getHealth());
    }

    @Test
    public void canSummon() {
        darthPlagueis = new DarthPlagueis("Darth Plagueis", 400, forcePush, superStarDestroyer);
        enemy = new Finn(40, 250, "Finn");
        superStarDestroyer = new SuperStarDestroyer();
        darthPlagueis.summon(enemy);
        assertEquals(-350, enemy.getHealth());
    }

    @Test
    public void canChangeSummons() {
        darthPlagueis = new DarthPlagueis("Darth Plagueis", 400, forcePush, superStarDestroyer);
        enemy = new Finn(40, 250, "Finn");
        deathStar = new DeathStar();
        darthPlagueis.setSummons(deathStar);
        darthPlagueis.summon(enemy);
        assertEquals(-750, enemy.getHealth());
    }

    @Test
    public void hasName() {
        assertEquals("Darth Plagueis", darthPlagueis.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(400, darthPlagueis.getHealth());
    }

    @Test
    public void canSpeak() {
        assertEquals("The power of the dark side is an illness no true Sith would wish to be cured of", darthPlagueis.speak());
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
    public void enemyHasAttck() {
        assertEquals(40, enemy.getAttack());
    }

    @Test
    public void canHeal() {
        regen = new ForceHeal();
        darthPlagueis.heal(50);
        assertEquals(450, darthPlagueis.getHealth());
    }

}
