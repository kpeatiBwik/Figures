public abstract class AbstractFigure {
    private String figureType;

    public AbstractFigure(String figureType) {
        super();
        setFigureType(figureType);
    }

    public String getFigureType() {
        return figureType;
    }

    private void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    abstract double getArea() throws IllegalArgumentException;

    abstract double getPerimeter() throws IllegalArgumentException;

    @Override
    public String toString() {
        String result;
        try {
            result = "Тип фигуры = ".concat(getFigureType()).concat(", площадь = ").concat(String.valueOf(getArea())).concat(", периметр = ").concat(String.valueOf(getPerimeter()));
        } catch (IllegalArgumentException e) {
            result = e.getMessage();
        }
        return result;
    }
}
