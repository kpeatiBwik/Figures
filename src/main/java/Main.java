import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<AbstractFigure> abstractFigures = new ArrayList<AbstractFigure>();
        abstractFigures.add(new Circle(FiguresType.getCIRCLE(), 4));
        abstractFigures.add(new Square(FiguresType.getSQUARE(), 4));
        abstractFigures.add(new Rectangle(FiguresType.getRECTANGLE(), 10, 5));
        abstractFigures.add(new Triangle(FiguresType.getTRIANGLE(), 10, 12, 15));

        for (AbstractFigure abstractFigure : abstractFigures) {
            System.out.println(abstractFigure.toString());
        }
    }
}
