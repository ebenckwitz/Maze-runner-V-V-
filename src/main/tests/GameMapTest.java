package main.game;


import javafx.scene.layout.Priority;
import main.game_objects.Exit;
import main.game_objects.Key;
import main.game_objects.Player;
import main.game_objects.Position;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class GameMapTest {
    @Test(group="firstGroup");
    public void testConstructor() {
        GameMap actualGameMap = new GameMap(1, 1);
        assertEquals(3, actualGameMap.getHeight());
        assertEquals(5, actualGameMap.getWidth());
        assertEquals(3, actualGameMap.getMap().length);
    }

    @Test
    public void testAddToMap() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> gameMap.addToMap(new Exit(new Position(2, 3))));
    }

    @Test
    public void testAddToMap2() {
        GameMap gameMap = new GameMap(1, 1);
        gameMap.addToMap(new Exit(new Position(2, 0)));
    }

    @Test
    public void testAddToMap3() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> gameMap.addToMap(new Key(new Position(2, 3))));
    }

    @Test
    public void testAddToMap4() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> gameMap.addToMap(new Exit(new Position(-1, 0))));
    }

    @Test
    public void testGetRandomPosition() {
        assertEquals("2, 1", (new GameMap(1, 1)).getRandomPosition().toString());
    }

    @Test
    public void testValidateMovement() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(2, 3)), 1));
    }

    @Test(group="second group")
    public void testValidateMovement10() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(0, 3)), 39));
    }

    @Test
    public void testValidateMovement11() {
        GameMap gameMap = new GameMap(1, 1);
        assertTrue(gameMap.validateMovement(new Player(new Position(2, 0)), 40));
    }

    @Test
    public void testValidateMovement12() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(2, -1)), 40));
    }

    @Test
    public void testValidateMovement13() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(2, Integer.MIN_VALUE)), 40));
    }

    @Test
    public void testValidateMovement14() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(0, 0)), 39));
    }

    @Test
    public void testValidateMovement15() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(37, 0)), 40));
    }

    @Test(priority=4)
    public void testValidateMovement16() {
        GameMap gameMap = new GameMap(2, 37);
        assertTrue(gameMap.validateMovement(new Player(new Position(37, 3)), 37));
    }

    @Test(priority=2)
    public void testValidateMovement17() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(Integer.MIN_VALUE, 0)), 39));
    }

    @Test(enabled=false)
    public void testValidateMovement20() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(Integer.MIN_VALUE, 0)), 39));
    }

    @Test()
    public void testValidateMovement2() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(2, 3)), 37));
    }

    @Test
    public void testValidateMovement3() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(2, 3)), 38));
    }

    @Test
    public void testValidateMovement4() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(2, 3)), 39));
    }

    @Test
    public void testValidateMovement5() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(2, 3)), 40));
    }

    @Test
    public void testValidateMovement6() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(37, 3)), 37));
    }

    @Test
    public void testValidateMovement7() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(37, 3)), 38));
    }

    @Test
    public void testValidateMovement8() {
        GameMap gameMap = new GameMap(1, 1);
        assertFalse(gameMap.validateMovement(new Player(new Position(2, 0)), 38));
    }

    @Test(priority=1)
    public void testValidateMovement9() {
        GameMap gameMap = new GameMap(1, 1);
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> gameMap.validateMovement(new Player(new Position(2, 37)), 38));
    }
}

