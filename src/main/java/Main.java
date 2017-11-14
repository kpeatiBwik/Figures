import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<AbstractFigure> abstractFigures = new ArrayList<AbstractFigure>();
        abstractFigures.add(new Circle(FiguresType.CIRCLE, 4));
        abstractFigures.add(new Square(FiguresType.SQUARE, 4));
        abstractFigures.add(new Rectangle(FiguresType.RECTANGLE, 10, 5));
        abstractFigures.add(new Triangle(FiguresType.TRIANGLE, 10, 12, 15));

        for (AbstractFigure abstractFigure : abstractFigures) {
            System.out.println(abstractFigure.toString());
        }
    }
}
