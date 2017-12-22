/**
 * created by Vitaha
 * skype: dp100991svi
 */

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (true) {
                menu();
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректные данные");
            scanner.close();
        }
    }


    static void menu() throws NumberFormatException {
        System.out.println("Вычислить площадь и периметр:\n1.Круга\n2.Треугольника\n3.Квадрата\n4.Прямоугольника\n5.Выход из программы");
        String x = scanner.nextLine();
        switch (x) {
            case "1":
                System.out.println("Введите радиус круга:");
                String r = scanner.nextLine();
                AbstractFigure circle = new Circle(FiguresType.CIRCLE, r);
                System.out.println(circle.toString());
                break;
            case "2":
                System.out.println("Введите первую из трех сторон треугольника:");
                String l1 = scanner.nextLine();
                System.out.println("Введите вторую из трех сторон треугольника:");
                String l2 = scanner.nextLine();
                System.out.println("Введите третью из трех сторон треугольника:");
                String l3 = scanner.nextLine();
                AbstractFigure triangle = new Triangle(FiguresType.TRIANGLE, l1, l2, l3);
                System.out.println(triangle.toString());
                break;
            case "3":
                System.out.println("Введите сторону квадрата:");
                String s1 = scanner.nextLine();
                AbstractFigure square = new Square(FiguresType.SQUARE, s1);
                System.out.println(square.toString());
                break;
            case "4":
                System.out.println("Введите первую сторону прямоугольника:");
                String rec1 = scanner.nextLine();
                System.out.println("Введите первую сторону прямоугольника:");
                String rec2 = scanner.nextLine();
                AbstractFigure rectangle = new Rectangle(FiguresType.RECTANGLE, rec1, rec2);
                System.out.println(rectangle.toString());
                break;
            case "5":
                System.out.println("Всего доброго!");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Выбор пункта меню неправильный, попробуйте ещё раз");
        }
    }
}