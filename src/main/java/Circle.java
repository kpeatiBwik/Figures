public class Circle extends AbstractFigure implements Comparable<Circle> {

    private double radius;

    protected Circle(String figureType, String radius) {
        super(figureType);
        setRadius(radius);
    }

    private double getRadius() {
        return radius;
    }

    private void setRadius(String radius) {
        this.radius = Double.valueOf(radius);
    }

    double getArea() {
        if (getRadius() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return Math.PI * Math.pow(getRadius(), 2);
    }

    double getPerimeter() {
        if (getRadius() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return 2 * Math.PI * getRadius();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public int compareTo(Circle o) {
        return (int) (this.radius - o.getRadius());
    }

    @Override
    public String toString() {
        return super.toString() + " Circle {" + " radius = " + radius + " }";
    }
}
