package force_users_test;

import enemies.Enemy;
import enemies.MaceWindu;
import force_users.force_power_users.DarthSidious;
import force_users.force_powers.ForceLightning;
import force_users.force_powers.ForcePush;
import org.junit.Before;
import summons.DeathStar;
import summons.SuperStarDestroyer;

public class DarthSidiousTest  {

    DarthSidious darthSidious;
    Enemy enemy;
    ForceLightning forceLightning;
    ForcePush forcePush;
    DeathStar deathStar;
    SuperStarDestroyer superStarDestroyer;

    @Before
    public void before() {
        darthSidious = new DarthSidious("Darth Sidious", 600, forceLightning, deathStar);
        enemy = new MaceWindu(150, 500, "Mace Windu");
        forceLightning = new ForceLightning();
        forcePush = new ForcePush();
        deathStar = new DeathStar();
        superStarDestroyer = new SuperStarDestroyer();
    }

}
