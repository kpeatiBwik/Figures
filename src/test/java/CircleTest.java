import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    private AbstractFigure circle = new Circle(FiguresType.CIRCLE, "4");


    @Test
    public void testGetArea() {
        final double expected = 50.26548245743669;
        Assert.assertTrue(expected == circle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        final double expected = 25.132741228718345;
        Assert.assertTrue(expected == circle.getPerimeter());
    }
}