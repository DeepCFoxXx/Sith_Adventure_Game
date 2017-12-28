import enemies.MaceWindu;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaceWinduTest {

    MaceWindu macewindu;

    @Before
    public void before(){
        macewindu = new MaceWindu(100, 500);
    }

    @Test
    public void hasAttack() {
        assertEquals(100, macewindu.getAttack());
    }

    @Test
    public void hasHealth() {
        assertEquals(500, macewindu.getHealth());
    }

}
