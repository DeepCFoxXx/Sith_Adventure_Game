package force_healer_test;

import force_healer.ForceHeal;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.fighters.DarthVader;
import sith.weapons.Lightsaber;

import static org.junit.Assert.assertEquals;

public class ForceHealTest {

    ForceHeal forceHeal;
    Lightsaber lightsaber;
    DarthVader darthVader;

    @Before
    public void before() {
        forceHeal = new ForceHeal();
        lightsaber = new Lightsaber();
        darthVader = new DarthVader("Darth Vader", 1000, lightsaber, 100);
    }

    @Test
    public void forceHealHasHealthValue() {
        assertEquals(50, forceHeal.getHealValue());
    }
//    @Test
//    public void canHeal() {
//        forceHeal.heal(darthVader);
//        assertEquals(1050, darthVader.getHealth());
//    }
}
