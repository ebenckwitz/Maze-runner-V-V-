package main.game;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import main.game_objects.Player;
import main.game_objects.Position;
import org.testng.annotations.Test;

public class LevelTwoTest {
    @Test
    public void testConstructor() {
        GameMap gameMap = new GameMap(1, 1);
        Position position = new Position(2, 3);
        Player player = new Player(position);
        char[] toCharArrayResult = "AAAAAAAA".toCharArray();
        char[] toCharArrayResult1 = "AAAAAAAA".toCharArray();
        Position position1 = new Position(2, 3);
        new LevelTwo(gameMap, player, new Display(
                new char[][]{toCharArrayResult, toCharArrayResult1, "AAAAAAAA".toCharArray()}, new Player(position1)));
        assertEquals(3, gameMap.getHeight());
        assertEquals(5, gameMap.getWidth());
        assertEquals(3, gameMap.getMap().length);
        assertEquals(250, player.getHealthLevel());
        assertFalse(player.isDead());
        assertFalse(player.hasTorch());
        assertEquals(3, player.getY());
        assertEquals(2, player.getX());
        assertEquals(2, player.getVisibility());
        Position position2 = player.getPosition();
        assertSame(position, position2);
        assertEquals(position1, position2);
        assertEquals('J', player.getIcon());
    }
}

