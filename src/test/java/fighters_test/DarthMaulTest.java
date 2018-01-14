package fighters_test;

import enemies.Enemy;
import enemies.MaceWindu;
import force_healer.ForceHeal;
import force_healer.Regen;
import org.junit.Before;
import org.junit.Test;
import force.fighters.DarthMaul;
import sith.weapons.DoubleBladedLightsaber;
import sith.weapons.IWeapon;
import sith.weapons.Lightsaber;

import static org.junit.Assert.assertEquals;

public class DarthMaulTest {

    DarthMaul darthMaul;
    Enemy enemy;
    IWeapon doubleBladedLightsaber;
    IWeapon lightsaber;
    Regen regen;

    @Before
    public void before() {
        doubleBladedLightsaber = new DoubleBladedLightsaber();
        lightsaber = new Lightsaber();
        darthMaul = new DarthMaul("Darth Maul", 550, doubleBladedLightsaber, 30);
        enemy = new MaceWindu(100, 500, "Mace Windu");
    }

    @Test
    public void hasName() {
        assertEquals("Darth Maul", darthMaul.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(550, darthMaul.getHealth());
    }

    @Test
    public void hasSpeed(){
        assertEquals(30, darthMaul.getSpeed());
    }

    @Test
    public void canSpeak(){
        assertEquals("At last we will reveal ourselves to the jedi", darthMaul.speak());
    }

    @Test
    public void canSwapWeapon(){
        darthMaul.setWeapon(lightsaber);
        darthMaul.attack(enemy);
        assertEquals(350, enemy.getHealth());
    }

     @Test
    public void canTakeDamge(){
        darthMaul.takeDamage(100);
        assertEquals(450, darthMaul.getHealth());
     }

     @Test
    public void canAttack(){
        darthMaul.attack(enemy);
        assertEquals(250, enemy.getHealth());
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

    @Test
    public void canHeal() {
        regen = new ForceHeal();
        darthMaul.heal(50);
        assertEquals(600, darthMaul.getHealth());
    }
}
