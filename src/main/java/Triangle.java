import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.util.Arrays;

public class Triangle extends AbstractFigure implements InterfaceForTriangle {

    private double sideA;
    private double sideB;
    private double sideC;

    protected Triangle(String figureType, double sideA, double sideB, double sideC) {
        super(figureType);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public Triangle() {
        super(FiguresType.TRIANGLE);
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

    public String getMsg() {
        return "Hi, i'm Triangle";
    }
    //внутренний класс
    public static class IsoscelesTriangle implements InterfaceForTriangle {
        public String getMsg() {
            return "Hi, i'm IsoscelesTriangle";
        }
    }
    //вложенный класс
    public class EquilateralTriangle implements InterfaceForTriangle {
        public String getMsg() {
            return "Hi, i'm EquilateralTriangle";
        }
    }
    //метод внутри которого анонимный класс
    String methodWithAnonymousClass() {
        InterfaceForTriangle interfaceForTriangle = new InterfaceForTriangle() {
            public String getMsg() {
                return "Hi, a'm interfaceForTriangle from Triangle";
            }
        };
        return interfaceForTriangle.getMsg();
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
