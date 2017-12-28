package enemies_test;

import enemies.MaceWindu;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaceWinduTest {

    MaceWindu macewindu;

    @Before
    public void before(){
        macewindu = new MaceWindu(100, 500, "Mace Windu");
    }

    @Test
    public void hasAttack() {
        assertEquals(100, macewindu.getAttack());
    }

    @Test
    public void hasHealth() {
        assertEquals(500, macewindu.getHealth());
    }

    @Test
    public void hasName() {
        assertEquals("Mace Windu", macewindu.getName());
    }

    @Test
    public void canTakeDamage(){
        macewindu.takeDamage(150);
        assertEquals(350, macewindu.getHealth());
    }
}
