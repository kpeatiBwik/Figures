public class Rectangle extends AbstractFigure {

    private double sideA;
    private double sideB;

    protected Rectangle(String figureType, String sideA, String sideB) {
        super(figureType);
        setSideA(Double.valueOf(sideA));
        setSideB(Double.valueOf(sideB));
    }

    private double getSideA() {
        return sideA;
    }

    private void setSideA(double sideA) {
        this.sideA = sideA;
    }

    private double getSideB() {
        return sideB;
    }

    private void setSideB(double sideB) {
        this.sideB = sideB;
    }

    double getArea() {
        if (getSideA() <= 0 || getSideB() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return getSideA() * getSideB();
    }

    double getPerimeter() {
        if (getSideA() <= 0 || getSideB() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return (2 * getSideA()) + (2 * getSideB());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.sideA, sideA) != 0) return false;
        return Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
