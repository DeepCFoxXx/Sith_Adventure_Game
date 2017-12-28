package enemies_test;

import enemies.Finn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinnTest {

    Finn finn;

    @Before
    public void before() {
        finn = new Finn(40, 250, "Finn");
    }

    @Test
    public void hasAttack() {
        assertEquals(40, finn.getAttack());
    }

    @Test
    public void hasHealth() {
        assertEquals(250, finn.getHealth());
    }

    @Test
    public void hasName(){
        assertEquals("Finn", finn.getName());
    }

    @Test
    public void canTakeDamage() {
        finn.takeDamage(150);
        assertEquals(100, finn.getHealth());
    }
}
