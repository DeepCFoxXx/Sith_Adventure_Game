package fighters_test;


import enemies.Enemy;
import enemies.Yoda;
import org.junit.Before;
import players.fighters.DarthVader;
import sith.weapons.CrossGuardLightsaber;
import sith.weapons.IWeapon;
import sith.weapons.Lightsaber;

public class DarthVaderTest {

    DarthVader darthVader;
    Enemy enemy;
    IWeapon lightsaber;
    IWeapon crossGuardLightsaber;

    @Before
    public void before(){
      lightsaber = new Lightsaber();
      crossGuardLightsaber = new CrossGuardLightsaber();
      darthVader = new DarthVader("Darth Vader", 1000, lightsaber, 100);
      enemy = new Yoda(50, 300, "Yoda");
    }

}
