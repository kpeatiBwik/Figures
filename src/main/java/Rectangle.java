public class Rectangle extends AbstractFigure {

    private double sideA;
    private double sideB;

    protected Rectangle(String figureType, double sideA, double sideB) {
        super(figureType);
        setSideA(sideA);
        setSideB(sideB);
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
        return getSideA() * getSideB();
    }

    double getPerimeter() {
        return (2 * getSideA()) + (2 * getSideB());
    }
}
