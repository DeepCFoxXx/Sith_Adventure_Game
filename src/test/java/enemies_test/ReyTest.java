package enemies_test;

import enemies.Rey;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReyTest {

    Rey rey;

    @Before
    public void before(){
        rey = new Rey(120, 600, "Rey");
    }

    @Test
    public void hasAttack() {
        assertEquals(120, rey.getAttack());
    }

    @Test
    public void hasHealth() {
        assertEquals(600, rey.getHealth());
    }

    @Test
    public void hasName() {
        assertEquals("Rey", rey.getName());
    }

    @Test
    public void canTakeDamage(){
        rey.takeDamage(150);
        assertEquals(450, rey.getHealth());
    }
}
