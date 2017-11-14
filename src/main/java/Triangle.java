public class Triangle extends AbstractFigure {

    private double sideA;
    private double sideB;
    private double sideC;

    protected Triangle(String figureType, double sideA, double sideB, double sideC) {
        super(figureType);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
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

    private double getSideC() {
        return sideC;
    }

    private void setSideC(double sideC) {
        this.sideC = sideC;
    }

    double getArea() {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }

    double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }
}
