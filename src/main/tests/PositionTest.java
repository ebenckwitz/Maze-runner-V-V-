package main.game_objects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PositionTest {

	@Test
	void testGetX() {
		Position pos = new Position(0, 0);
        pos.getX();
        assertTrue(pos.getX() == 0);
        assertFalse(pos.getX() == 5);
	}
	
	@Test
	void testGetY() {
		Position pos = new Position(5, 5);
        pos.getY();
        assertTrue(pos.getY() == 5);
        assertFalse(pos.getY() == 3);
	}
	
	@Test
	void testToString() {
		Position pos = new Position(5, 5);
		pos.toString();
		assertEquals(pos.toString(), "5, 5");
		assertEquals(pos.toString(), "0, 0");
	}
	
	@Test
	void testEquals() {
		Position pos = new Position(5, 5);
		pos.equals(pos);
		Assert.assertSame(pos, pos);
	}
}
