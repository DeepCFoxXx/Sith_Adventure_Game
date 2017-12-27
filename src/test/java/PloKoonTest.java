import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PloKoonTest {

    PloKoon ploKoon;

    @Before
    public void before(){
        ploKoon = new PloKoon(40, 250);
    }

    @Test
    public void hasAttack() {
        assertEquals(40, ploKoon.getAttack());
    }

    @Test
    public void hasHealth() {
        assertEquals(250, ploKoon.getHealth());
    }
}
