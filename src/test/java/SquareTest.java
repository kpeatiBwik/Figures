import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square = new Square(FiguresType.SQUARE, "4");

    @Test
    void testGetArea() {
        final double expected = 16.0;
        Assert.assertTrue(expected == square.getArea());
    }

    @Test
    void testGetPerimeter() {
        final double expected = 16.0;
        Assert.assertTrue(expected == square.getPerimeter());
    }
}