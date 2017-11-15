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
        if (getRadius() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return Math.PI * Math.pow(getRadius(), 2);
    }

    double getPerimeter() {
        if (getRadius() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return 2 * Math.PI * getRadius();
    }
}
