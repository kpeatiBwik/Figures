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
        if (getSideA() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return getSideA() * getSideA();
    }

    double getPerimeter() {
        if (getSideA() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return getSideA() * 4;
    }
}
