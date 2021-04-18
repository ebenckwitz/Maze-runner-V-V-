package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.game.Game;

class GameTest {

	@Test
	void initTest() {
		Game game = new Game(); 
		int height = 3;
		int width = 5;
		String board = game.init(height, width);
		assertEquals("That's not a number minimum of 5 for height! Enter again: ", board);
		assertNotEquals("Starting game", board);
		
		height = 5;
		width = 3;
		board = game.init(height, width);
		assertEquals("That's not a number minimum of 5 for ! Enter again: ", board);
		assertNotEquals("Starting game", board);
		
		height = 6; 
		width = 6;
		board = game.init(height, width);
		assertEquals("Starting game", board);
		assertNotEquals("That's not a number minimum of 5 for ! Enter again: ", board);
		
	}
}
