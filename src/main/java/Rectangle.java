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
        if (getSideA() <= 0 || getSideB() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return getSideA() * getSideB();
    }

    double getPerimeter() {
        if (getSideA() <= 0 || getSideB() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return (2 * getSideA()) + (2 * getSideB());
    }
}
