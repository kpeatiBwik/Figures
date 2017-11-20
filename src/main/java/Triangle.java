import java.util.*;

public class Triangle extends AbstractFigure {

    private double sideA;
    private double sideB;
    private double sideC;

    protected Triangle(String figureType, String sideA, String sideB, String sideC) {
        super(figureType);
        setSideA(Double.valueOf(sideA));
        setSideB(Double.valueOf(sideB));
        setSideC(Double.valueOf(sideC));
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
        if (!(check >= 0)) throw new IllegalArgumentException("Некорректные данные");
        return Math.sqrt(check);
    }

    double getPerimeter() throws IllegalArgumentException {
        double[] x = new double[]{getSideA(), getSideB(), getSideC()};
        Arrays.sort(x);
        if (x[0] + x[1] < x[2]) throw new IllegalArgumentException("Некорректные данные");
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        if (Double.compare(triangle.sideB, sideB) != 0) return false;
        return Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
