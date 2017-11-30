import java.io.Serializable;

public class Square extends AbstractFigure implements Comparable<Square>, Serializable {
    public static final long serialVersionUID = 42L;
    private double sideA;

    protected Square(String figureType, String sideA) {
        super(figureType);
        setSideA(Double.valueOf(sideA));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Square o) {
        return (int) (this.sideA - o.getSideA());
    }

    @Override
    public String toString() {
        return super.toString() + ", Square {" + " sideA = " + sideA + " }";
    }

//не тру компаратор
//    static int squareComparator(Square s1, Square s2) {
//        return (int) s1.getSideA() > s2.getSideA() ? 1 : s1.getSideA() < s2.getSideA() ? -1 : 0;
//    }
}


