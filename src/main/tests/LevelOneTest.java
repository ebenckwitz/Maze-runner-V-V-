import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.KeyListener;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.game_objects.Key;
import main.game_objects.Player;
import main.game_objects.Position;

class LevelOneTest {

	@Test
	void testStart() {
		Position p = new Position(1,1);
		 final Player player = new Player(p);
		// ArrayList<Key> keys = new ArrayList<Key> ();
		 GameMap gm = new GameMap(5, 5);
		 char [] [] map = new char [5] [5];
		 Display d = new Display(map, player);
		 LevelOne g = new LevelOne(gm, player, d);
		// player.isDead();
		// keys.size() = 0;
		 g.start();
		 String x = "Player dead, Level Failed";
		 assertEquals(x, g.start());
		 
		 
		
	}
	


}
