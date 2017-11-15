import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {

    private Circle circle = new Circle(FiguresType.CIRCLE, 4);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

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