import java.util.Comparator;

public class CompByType implements Comparator<AbstractFigure>{
    @Override
    public int compare(AbstractFigure o1, AbstractFigure o2) {
        if (o1.getClass().equals(o2.getClass())) {
            return 0;
        }
        if (o1 instanceof Circle || o2 instanceof Triangle) {
            return -1;
        }
        if (o1 instanceof Square && o2 instanceof Rectangle) {
            return -1;
        }
        return 1;
    }
}
