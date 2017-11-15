import org.junit.Test;

public class CircleTest {

    private AbstractFigure circle = new Circle(FiguresType.CIRCLE, 4);

    @Test
    public void testGetArea() {
        final double expected = 50.26548245743669;
        if (expected == circle.getArea()) {
            System.out.println(".getArea для ".concat(circle.getFigureType()).concat(" - отрабатывает корректно"));
        } else {
            System.out.println(".getArea для ".concat(circle.getFigureType()).concat(" - отрабатывает НЕ корректно!"));
        }
    }

    @Test
    public void testGetPerimeter() {
        final double expected = 25.132741228718345;
        if (expected == circle.getPerimeter()) {
            System.out.println(".getPerimeter для ".concat(circle.getFigureType()).concat(" - отрабатывает корректно"));
        } else {
            System.out.println(".getPerimeter для ".concat(circle.getFigureType()).concat(" - отрабатывает НЕ корректно!"));
        }
    }
}