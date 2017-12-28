import enemies.Yoda;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YodaTest {

    Yoda yoda;

    @Before
    public void before(){
        yoda = new Yoda(50, 300);
    }

    @Test
    public void hasAttack() {
        assertEquals(50, yoda.getAttack());
    }

    @Test
    public void hasHealth() {
        assertEquals(300, yoda.getHealth());
    }


}
