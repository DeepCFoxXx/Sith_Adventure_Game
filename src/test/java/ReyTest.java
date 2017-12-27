import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReyTest {

    Rey rey;

    @Before
    public void before(){
        rey = new Rey(120, 600);
    }

    @Test
    public void hasAttack() {
        assertEquals(120, rey.getAttack());
    }

    @Test
    public void hasHealth() {
        assertEquals(600, rey.getHealth());
    }
}
