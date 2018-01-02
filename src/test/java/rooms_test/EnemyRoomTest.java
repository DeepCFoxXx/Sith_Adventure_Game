package rooms_test;

import org.junit.Before;
import org.junit.Test;
import rooms.EnemyRoom;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom room;

    @Before
    public void before() {
        room = new EnemyRoom();
    }

    @Test
    public void hasEnemy() {
        assertNotNull(room.getEnemy());
    }

    @Test
    public void canNotExit() {
        assertEquals(false, room.canExit());
    }
}
