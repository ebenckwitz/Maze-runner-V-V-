package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.awt.event.KeyEvent;

import org.junit.jupiter.api.Test;

import main.game_objects.Player;
import main.game_objects.Position;

class PlayerTest {

	@Test
	void Visabilitytest() {
		Position position = new Position(3,4);
		Player player = new Player(position);
		assertEquals(2, player.getVisibility());
		assertFalse(player.getVisibility() == 4); //added test
	}
	
	@Test
	void HealthLevelTest() {
		Position position = new Position(3,4);
		Player player = new Player(position);
		assertEquals(250, player.getHealthLevel());
		assertFalse(player.isDead()); //added test
		
		player.reduceHealthLevelBy(50);
		assertNotEquals(250, player.getHealthLevel());
		assertEquals(200, player.getHealthLevel());
		assertFalse(player.isDead()); //added test
		
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
		assertEquals(4, player.getVisibility()); //added test
	}
	
	@Test
	void moveTest() { //added method
		Position position = new Position(4,4);
		Player player = new Player(position);

	    int DIRECTION_UP = KeyEvent.VK_UP;
	    int DIRECTION_DOWN = KeyEvent.VK_DOWN;
	    int DIRECTION_LEFT = KeyEvent.VK_LEFT;
	    int DIRECTION_RIGHT = KeyEvent.VK_RIGHT;
	    
	    player.move(DIRECTION_UP);
	    assertEquals(2, player.getY());
	    
	    player.move(DIRECTION_DOWN);
	    assertEquals(4, player.getY());
	    
	    player.move(DIRECTION_LEFT);
	    assertEquals(0, player.getX());
	    
	    player.move(DIRECTION_RIGHT);
	    assertEquals(4, player.getX());
	}
}
