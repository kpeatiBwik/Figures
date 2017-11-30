import java.util.Comparator;

class FiguresComparator implements Comparator<AbstractFigure> {

    @Override
    public int compare(AbstractFigure o1, AbstractFigure o2) {
        if (o1 instanceof Circle) {
            if (o2 instanceof Circle) {
                return ((Circle) o1).compareTo((Circle) o2);
            } else if (o2 instanceof Square) {
                return -1;
            }
        } else if (o1 instanceof Square) {
            if (o2 instanceof Square) {
                return ((Square) o1).compareTo((Square) o2);
            } else if (o2 instanceof Circle) {
                return 1;
            }
        }
        return 1;
    }
}
