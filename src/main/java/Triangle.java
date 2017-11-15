import java.util.Arrays;

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

    double getArea() throws IllegalArgumentException {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        double check = p * (p - getSideA()) * (p - getSideB()) * (p - getSideC());
        if (!(check > 0)) throw new IllegalArgumentException("Некорректные данные");
        return Math.sqrt(check);
    }

    double getPerimeter() throws IllegalArgumentException {
        double[] x = new double[]{getSideA(), getSideB(), getSideC()};
        Arrays.sort(x);
        if (x[0] + x[1] < x[2]) throw new IllegalArgumentException("Некорректные данные");
        return getSideA() + getSideB() + getSideC();
    }
}
