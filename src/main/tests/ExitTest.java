package main.game_objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import main.game.GameMap;
import org.testng.annotations.Test;


public class ExitTest {
//    @Test
//    public void testGenerateExitPosition() {
//        GameMap gameMap = mock(GameMap.class);
//        when(gameMap.getHeight()).thenReturn(1);
//        when(gameMap.getWidth()).thenReturn(1);
//        Position actualGenerateExitPositionResult = Exit.generateExitPosition(gameMap, new Player(new Position(2, 3)));
//        assertEquals(2, actualGenerateExitPositionResult.getX());
//        assertEquals(1, actualGenerateExitPositionResult.getY());
//        verify(gameMap).getWidth();
//        verify(gameMap).getHeight();
//    }
//
//    @Test
//    public void testGenerateExitPosition2() {
//        GameMap gameMap = mock(GameMap.class);
//        when(gameMap.getHeight()).thenReturn(1);
//        when(gameMap.getWidth()).thenReturn(1);
//        Position actualGenerateExitPositionResult = Exit.generateExitPosition(gameMap, new Player(new Position(0, 3)));
//        assertEquals(-2, actualGenerateExitPositionResult.getX());
//        assertEquals(1, actualGenerateExitPositionResult.getY());
//        verify(gameMap, times(2)).getWidth();
//        verify(gameMap).getHeight();
//    }
//
//    @Test
//    public void testGenerateExitPosition3() {
//        GameMap gameMap = mock(GameMap.class);
//        when(gameMap.getHeight()).thenReturn(1);
//        when(gameMap.getWidth()).thenReturn(1);
//        Position actualGenerateExitPositionResult = Exit.generateExitPosition(gameMap, new Player(new Position(2, 0)));
//        assertEquals(2, actualGenerateExitPositionResult.getX());
//        assertEquals(-1, actualGenerateExitPositionResult.getY());
//        verify(gameMap).getWidth();
//        verify(gameMap, times(2)).getHeight();
//    }
//
//    @Test
//    public void testGenerateExitPosition4() {
//        GameMap gameMap = mock(GameMap.class);
//        when(gameMap.getHeight()).thenReturn(0);
//        when(gameMap.getWidth()).thenReturn(1);
//        Position actualGenerateExitPositionResult = Exit.generateExitPosition(gameMap, new Player(new Position(0, 3)));
//        assertEquals(-2, actualGenerateExitPositionResult.getX());
//        assertEquals(1, actualGenerateExitPositionResult.getY());
//        verify(gameMap, times(2)).getWidth();
//        verify(gameMap).getHeight();
//    }
//
//    @Test
//    public void testGenerateExitPosition5() {
//        GameMap gameMap = mock(GameMap.class);
//        when(gameMap.getHeight()).thenReturn(1);
//        when(gameMap.getWidth()).thenReturn(1);
//        Position actualGenerateExitPositionResult = Exit.generateExitPosition(gameMap, new Player(new Position(0, 0)));
//        assertEquals(-2, actualGenerateExitPositionResult.getX());
//        assertEquals(-1, actualGenerateExitPositionResult.getY());
//        verify(gameMap, times(2)).getWidth();
//        verify(gameMap, times(2)).getHeight();
//    }
}

