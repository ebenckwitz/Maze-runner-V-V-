package main.maze_generator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MazeGeneratorTest {
    @Test
    public void testGenerate() {
        assertEquals(3, (new MazeGenerator(1, 1)).generate().length);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> (new MazeGenerator(0, 1)).generate());
        assertThrows(NegativeArraySizeException.class, () -> (new MazeGenerator(Integer.MIN_VALUE, 1)).generate());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> (new MazeGenerator(1, 0)).generate());
        assertEquals(5, (new MazeGenerator(2, 2)).generate().length);
        assertEquals(5, (new MazeGenerator(2, 3)).generate().length);
        assertEquals(7, (new MazeGenerator(3, 2)).generate().length);
        assertEquals(7, (new MazeGenerator(3, 3)).generate().length);
        assertEquals(9, (new MazeGenerator(4, 2)).generate().length);
        assertEquals(11, (new MazeGenerator(5, 3)).generate().length);
    }
}

