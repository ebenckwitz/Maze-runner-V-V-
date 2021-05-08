package main.game_objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class KeyTest {
    @Test
    public void testGetDirectionHints() {
        Key key = new Key(new Position(2, 3));
        assertEquals("", key.getDirectionHints(new Position(2, 3)));
    }

    @Test
    public void testGetDirectionHints2() {
        Key key = new Key(new Position(0, 3));
        assertEquals("<- ", key.getDirectionHints(new Position(2, 3)));
    }

    @Test
    public void testGetDirectionHints3() {
        Key key = new Key(new Position(3, 3));
        assertEquals("-> ", key.getDirectionHints(new Position(2, 3)));
    }

    @Test
    public void testGetDirectionHints4() {
        Key key = new Key(new Position(2, 0));
        assertEquals("^ ", key.getDirectionHints(new Position(2, 3)));
    }
}

