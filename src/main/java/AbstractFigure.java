public abstract class AbstractFigure {
    private String figureType;

    public AbstractFigure(String figureType) {
        super();
        setFigureType(figureType);
    }

    private String getFigureType() {
        return figureType;
    }

    private void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Тип фигуры = " + getFigureType() + ", площадь = " + String.valueOf(getArea()) + ", периметр = " + String.valueOf(getPerimeter());
    }
}
