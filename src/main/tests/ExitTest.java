package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.game.GameMap;
import main.game_objects.Exit;
import main.game_objects.Player;
import main.game_objects.Position;

class ExitTest {

	@Test
	void generateExitPositionTest() {
		GameMap gameMap = new GameMap(5, 5);
		
		Position position = new Position(3,4); //quadrant 4
		Player player = new Player(position);
		Position expectedPos = new Position(18,9);
		assertEquals(expectedPos, Exit.generateExitPosition(gameMap, player));
		
		position = new Position(1,1); //quadrant 2
		player = new Player(position);
		expectedPos = new Position(18,9);
		assertEquals(expectedPos, Exit.generateExitPosition(gameMap, player));
		
		position = new Position(3,2); //quadrant 1
		player = new Player(position);
		expectedPos = new Position(18,9);
		assertEquals(expectedPos, Exit.generateExitPosition(gameMap, player));
		
		position = new Position(1,3); //quadrant 3
		player = new Player(position);
		expectedPos = new Position(18,9);
		assertEquals(expectedPos, Exit.generateExitPosition(gameMap, player));
		assertTrue(Exit.generateExitPosition(gameMap, player) == expectedPos);
		
		
	}

}
