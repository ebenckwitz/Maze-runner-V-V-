package main.game_objects;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameObjectTest {

	@Test
	void testGetIcon() {
		final char icon = 'C';
		Position position = new Position(5,5);
		GameObject game = new GameObject(icon, position);
		assertEquals(icon, game.getIcon());
	}
	
	@Test
	void testGetPosition() {
		final char icon = 'C';
		Position position = new Position(5,5);
		GameObject game = new GameObject(icon, position);
		assertEquals(position,game.getPosition());
	}
	
	@Test
	void testGetX() {
		Position position = new Position(1,2);
		position.getX();
		assertTrue(position.getX()== 1);
	}
	
	@Test
	void testGetY() {
		Position position = new Position(1,2);
		position.getY();
		assertTrue(position.getY()==2);
		
	}
	
	@Test
	void testDistanceTo() {
		final char icon = 'C';
		Position position = new Position(7,7);
		GameObject game = new GameObject(icon, position);
		
		final char icon2 = 'X';
		Position position2 = new Position(6,6);
		GameObject game2 = new GameObject(icon2, position2);
		
		//game.distanceTo(game2);
		assertEquals(0.5590169943749475,game.distanceTo(game2));
	}

}
