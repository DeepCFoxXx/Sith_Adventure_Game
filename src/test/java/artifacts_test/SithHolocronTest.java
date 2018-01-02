package artifacts_test;

import artifacts.SithHolocron;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SithHolocronTest {

    SithHolocron sithHolocron;

    @Before
    public void before() {
        sithHolocron = new SithHolocron();
    }

    @Test
    public void hasValue() {
        assertEquals(1000, sithHolocron.getValue());
    }

}
