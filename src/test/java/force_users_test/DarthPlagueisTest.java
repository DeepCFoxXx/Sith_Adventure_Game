package force_users_test;

import enemies.Enemy;
import enemies.Finn;
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

}
