public class Square extends AbstractFigure {

    private double sideA;

    protected Square(String figureType, double sideA) {
        super(figureType);
        setSideA(sideA);
    }

    private double getSideA() {
        return sideA;
    }

    private void setSideA(double sideA) {
        this.sideA = sideA;
    }

    double getArea() {
        return getSideA() * getSideA();
    }

    double getPerimeter() {
        return getSideA() * 4;
    }
}
