public class Circle extends AbstractFigure {

    private double radius;

    protected Circle(String figureType, double radius) {
        super(figureType);
        setRadius(radius);
    }

    private double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
