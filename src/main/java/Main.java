/**
 * created by Vitaha
 * skype: dp100991svi
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<AbstractFigure, String> abstractFigures1 = new HashMap<AbstractFigure, String>();
        AbstractFigure af = new Circle(FiguresType.CIRCLE, 3);
        AbstractFigure af2 = new Circle(FiguresType.CIRCLE, 4);
        abstractFigures1.put(af, "test1");
        abstractFigures1.put(af2, "test2");

        System.out.println(abstractFigures1.get(af));
        System.out.println(abstractFigures1.get(af2));
        System.out.println(abstractFigures1.size());

        Triangle triangle = new Triangle();

        List<InterfaceForTriangle> interfaceForTriangleList = new ArrayList<InterfaceForTriangle>();
        interfaceForTriangleList.add(new Triangle.IsoscelesTriangle());
        interfaceForTriangleList.add(triangle.new EquilateralTriangle());

        for (InterfaceForTriangle anInterfaceForTriangle : interfaceForTriangleList) {
            System.out.println(anInterfaceForTriangle.getMsg());
        }

        System.out.println(triangle.methodWithAnonymousClass());

        Circle circle = new Circle();
        System.out.println(circle.methodWithAnonymousClass());

        System.out.println(circle.new AnnonymusClassCircle().getTriangle().getMsg());
    }
}
