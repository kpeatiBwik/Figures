import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square = new Square(FiguresType.SQUARE, 4);

    @Test
    void testGetArea() {
        final double expected = 16.0;
        if (expected == square.getArea()) {
            System.out.println(".getArea для ".concat(square.getFigureType()).concat(" - отрабатывает корректно"));
        } else {
            System.out.println(".getArea для ".concat(square.getFigureType()).concat(" - отрабатывает НЕ корректно!"));
        }
    }

    @Test
    void testGetPerimeter() {
        final double expected = 16.0;
        if (expected == square.getArea()) {
            System.out.println(".getPerimeter для ".concat(square.getFigureType()).concat(" - отрабатывает корректно"));
        } else {
            System.out.println(".getPerimeter для ".concat(square.getFigureType()).concat(" - отрабатывает НЕ корректно!"));
        }
    }

}