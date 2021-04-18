package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.game_objects.Player;
import main.game_objects.Position;

class PlayerTest {

	@Test
	void Visabilitytest() {
		Position position = new Position(3,4);
		Player player = new Player(position);
		assertEquals(2, player.getVisibility());
	}
	
	@Test
	void HealthLevelTest() {
		Position position = new Position(3,4);
		Player player = new Player(position);
		assertEquals(250, player.getHealthLevel());
		
		player.reduceHealthLevelBy(50);
		assertNotEquals(250, player.getHealthLevel());
		assertEquals(200, player.getHealthLevel());
		
		player.reduceHealthLevelBy(200);
		assertTrue(player.isDead());
	}
	
	@Test
	void TorchTest() {
		Position position = new Position(3,4);
		Player player = new Player(position);
		
		assertFalse(player.hasTorch());
		
		player.foundTorch();
		assertTrue(player.hasTorch());
	}

}
