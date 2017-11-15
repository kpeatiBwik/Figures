import org.junit.Test;

public class CircleTest {

    private Circle circle = new Circle(FiguresType.CIRCLE, 4);

    @Test
    public void testGetArea() throws Exception {
        final double expected = 50.26548245743669;
        if (expected == circle.getArea()) {
            System.out.println(".getArea - отрабатывает корректно");
        } else {
            System.out.println(".getArea - отрабатывает НЕ корректно!");
        }
    }

    @Test
    public void testGetPerimeter() throws Exception {
        final double expected = 25.132741228718345;
        if (expected == circle.getPerimeter()) {
            System.out.println(".getPerimeter - отрабатывает корректно");
        } else {
            System.out.println(".getPerimeter - отрабатывает НЕ корректно!");
        }
    }
}