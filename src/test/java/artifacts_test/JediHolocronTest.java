package artifacts_test;

import artifacts.JediHolocron;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JediHolocronTest {

    JediHolocron jediHolocron;

    @Before
    public void before() {
        jediHolocron = new JediHolocron();
    }

    @Test
    public void getValue() {
        assertEquals(500, jediHolocron.getValue());
    }
}
