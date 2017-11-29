import java.io.Serializable;

public abstract class AbstractFigure implements Serializable{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractFigure that = (AbstractFigure) o;

        return figureType != null ? figureType.equals(that.figureType) : that.figureType == null;
    }

    @Override
    public int hashCode() {
        return figureType != null ? figureType.hashCode() : 0;
    }
}
