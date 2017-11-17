public class Circle extends AbstractFigure {

    private double radius;

    protected Circle(String figureType, double radius) {
        super(figureType);
        setRadius(radius);
    }

    public Circle() {
        super(FiguresType.CIRCLE);
    }

    private double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        if (getRadius() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return Math.PI * Math.pow(getRadius(), 2);
    }

    double getPerimeter() {
        if (getRadius() <= 0) throw new IllegalArgumentException("Некорректные данные");
        return 2 * Math.PI * getRadius();
    }

    //анонимный класс
    public class AnnonymusClassCircle {
        public Triangle getTriangle() {
            return new Triangle() {
                @Override
                public String getMsg() {
                    return "Hi, i'm Triangle from Circle";
                }
            };
        }
    }

    //метод внутри которого анонимный класс
    String methodWithAnonymousClass() {
        Triangle triangle = new Triangle() {
            @Override
            public String getFigureType() {
                return (this.getClass().getName());
            }
        };
        return triangle.getFigureType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
