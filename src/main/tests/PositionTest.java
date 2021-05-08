package main.game_objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PositionTest {
    @Test
    public void testEquals() {
        assertFalse((new Position(2, 3)).equals("Obj"));
    }

    @Test
    public void testEquals2() {
        Position position = new Position(2, 3);
        assertTrue(position.equals(new Position(2, 3)));
    }

    @Test
    public void testEquals3() {
        Position position = new Position(0, 3);
        assertFalse(position.equals(new Position(2, 3)));
    }

    @Test
    public void testEquals4() {
        Position position = new Position(2, 0);
        assertFalse(position.equals(new Position(2, 3)));
    }

    @Test
    public void testToString() {
        assertEquals("2, 3", (new Position(2, 3)).toString());
    }
}

