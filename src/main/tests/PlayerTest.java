package main.game_objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PlayerTest {
    @Test
    public void testReduceHealthLevelBy() {
        Player player = new Player(new Position(2, 3));
        player.reduceHealthLevelBy(42);
        assertEquals(208, player.getHealthLevel());
    }

    @Test
    public void testIsDead() {
        assertFalse((new Player(new Position(2, 3))).isDead());
    }

    @Test
    public void testIsDead2() {
        Player player = new Player(new Position(2, 3));
        player.reduceHealthLevelBy(Integer.MIN_VALUE);
        assertTrue(player.isDead());
    }

    @Test
    public void testFoundTorch() {
        Player player = new Player(new Position(2, 3));
        player.foundTorch();
        assertTrue(player.hasTorch());
        assertEquals(4, player.getVisibility());
    }

    @Test
    public void testMove() {
        Player player = new Player(new Position(2, 3));
        player.move(1);
        assertEquals(Player.INITIAL_HEALTH_LEVEL, player.getHealthLevel());
        assertFalse(player.hasTorch());
        assertEquals(3, player.getY());
        assertEquals(2, player.getVisibility());
    }

    @Test
    public void testMove2() {
        Player player = new Player(new Position(2, 3));
        player.move(Movable.DIRECTION_LEFT);
        assertEquals(3, player.getY());
        Position position = player.getPosition();
        assertEquals(3, position.getY());
        assertEquals(-2, position.getX());
    }

    @Test
    public void testMove3() {
        Player player = new Player(new Position(2, 3));
        player.move(Movable.DIRECTION_UP);
        assertEquals(1, player.getY());
        Position position = player.getPosition();
        assertEquals(1, position.getY());
        assertEquals(2, position.getX());
    }

    @Test
    public void testMove4() {
        Player player = new Player(new Position(2, 3));
        player.move(Movable.DIRECTION_RIGHT);
        assertEquals(3, player.getY());
        Position position = player.getPosition();
        assertEquals(3, position.getY());
        assertEquals(6, position.getX());
    }

    @Test
    public void testMove5() {
        Player player = new Player(new Position(2, 3));
        player.move(Movable.DIRECTION_DOWN);
        assertEquals(5, player.getY());
        Position position = player.getPosition();
        assertEquals(5, position.getY());
        assertEquals(2, position.getX());
    }

    @Test
    public void testMove6() {
        Player player = new Player(new Position(0, 3));
        player.move(Movable.DIRECTION_UP);
        assertEquals(1, player.getY());
        Position position = player.getPosition();
        assertEquals(1, position.getY());
        assertEquals(0, position.getX());
    }

    @Test
    public void testMove7() {
        Player player = new Player(new Position(0, 3));
        player.move(Movable.DIRECTION_RIGHT);
        assertEquals(3, player.getY());
        Position position = player.getPosition();
        assertEquals(3, position.getY());
        assertEquals(4, position.getX());
    }

    @Test
    public void testMove8() {
        Player player = new Player(new Position(0, 3));
        player.move(Movable.DIRECTION_DOWN);
        assertEquals(5, player.getY());
        Position position = player.getPosition();
        assertEquals(5, position.getY());
        assertEquals(0, position.getX());
    }

    @Test
    public void testMove9() {
        Player player = new Player(new Position(2, 3));
        player.reduceHealthLevelBy(42);
        player.move(Movable.DIRECTION_LEFT);
        assertEquals(3, player.getY());
        Position position = player.getPosition();
        assertEquals(3, position.getY());
        assertEquals(-2, position.getX());
    }
}

