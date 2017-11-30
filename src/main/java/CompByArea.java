import java.util.Comparator;

public class CompByArea implements Comparator<AbstractFigure> {

    @Override
    public int compare(AbstractFigure o1, AbstractFigure o2) {
        double tmp = o1.getArea() - o2.getArea();
        if (tmp == 0) return 0;
        if (tmp > 0) return 1;
        return -1;
    }
}
