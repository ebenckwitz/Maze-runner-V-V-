package main.game;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameMapTest {

	@Test
	void testGetHeight() {
		int min = 5;
		GameMap gMap = new GameMap(min, min);
		int x = gMap.getHeight();
		assertTrue(x > min);
	}
	
	@Test
	void testGetWidth() {
		int min = 5;
		int min2 = 4;
		GameMap gMap = new GameMap(min, min);
		int y = gMap.getWidth();
		assertTrue(y > min);
		assertTrue(y < min2);
	}
}
