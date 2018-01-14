package force_healer_test;

import force_healer.ForceHeal;
import force_healer.Regen;
import org.junit.Before;
import org.junit.Test;
import force.fighters.DarthVader;
import sith.weapons.Lightsaber;

import static org.junit.Assert.assertEquals;

public class ForceHealTest {

    ForceHeal forceHeal;
    Lightsaber lightsaber;
    DarthVader darthVader;
    Regen regen;

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

    @Test
    public void canHeal() {
        regen = new ForceHeal();
        darthVader.heal(50);
        assertEquals(1050, darthVader.getHealth());
    }
}
