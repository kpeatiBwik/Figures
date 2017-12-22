public class MainTest {
    public static void main(String[] args) {

    }
}

//стрим
//                List<Square> squares = new ArrayList<>();
//                squares.add(new Square(FiguresType.SQUARE, "5"));
//                squares.add(new Square(FiguresType.SQUARE, "8"));
//                squares.add(new Square(FiguresType.SQUARE, "3"));
//                squares.add(new Square(FiguresType.SQUARE, "1"));
//
//        squares.stream()
//                .filter(p -> p.getArea() > 1 && p.getPerimeter() <= 20)
//                .sorted()
//                .forEach(System.out::println);

//проверочка
//                List<AbstractFigure> abstractFigures = new ArrayList<AbstractFigure>();
//                abstractFigures.add(new Circle(FiguresType.CIRCLE, "4"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "4"));
//                abstractFigures.add(new Rectangle(FiguresType.RECTANGLE, "10", "5"));
//                abstractFigures.add(new Triangle(FiguresType.TRIANGLE, "10", "12", "15"));
//
//                for (AbstractFigure abstractFigure : abstractFigures) {
//                System.out.println(abstractFigure.toString());
//                }

//заюзал интерфейс Comparable
//                List<Square> squares = new ArrayList<>();
//                squares.add(new Square(FiguresType.SQUARE, "5"));
//                squares.add(new Square(FiguresType.SQUARE, "8"));
//                squares.add(new Square(FiguresType.SQUARE, "3"));
//                squares.add(new Square(FiguresType.SQUARE, "1"));
//
//                squares.forEach(System.out::println);
//                Collections.sort(squares);
//                System.out.println();
//                squares.forEach(System.out::println);

//сериализация
//                File file = new File("src\\main\\resources\\Square.dat");
//                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
//                Square s = new Square(FiguresType.SQUARE, "10");
//                oos.writeObject(s);
//                oos.flush();
//                } catch (Exception e) {
//                System.out.println(e.getMessage());
//                }
//
//
//                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\resources\\Square.dat"))) {
//                Square s = (Square) ois.readObject();
//                System.out.println(s.toString());
//                } catch (Exception e) {
//                System.out.println(e.getMessage());
//                }

//ещё один вариант сериализации
//                File file = new File("src\\main\\resources\\Square.dat");
//                try (Writer writer = new FileWriter(file)) {
//                Square s = new Square(FiguresType.SQUARE, "10");
//                writer.write(s.toString());
//                writer.flush();
//                } catch (Exception e) {
//                System.out.println(e.getMessage());
//                }

//тест компаратора (не интерфейса), как оказалось, в List метод sort имеет дефолтную реализацию, поэтому мой якобы компаратор работает как нужно
//                List<Square> squareList = new ArrayList<>();
//                squareList.add(new Square(FiguresType.SQUARE,"8"));
//                squareList.add(new Square(FiguresType.SQUARE,"1"));
//                squareList.add(new Square(FiguresType.SQUARE,"3"));
//                squareList.add(new Square(FiguresType.SQUARE,"4"));
//                squareList.add(new Square(FiguresType.SQUARE,"6"));
//                squareList.add(new Square(FiguresType.SQUARE,"2"));
//                squareList.add(new Square(FiguresType.SQUARE,"5"));
//                squareList.add(new Square(FiguresType.SQUARE,"9"));
//
//                squareList.forEach(System.out::println);
//                squareList.sort(Square::squareComparator);
//                System.out.println();
//                squareList.forEach(System.out::println);
//можно и так сортирнуть
//                Collections.sort(squareList,Square::squareComparator);

//адекватная проверка, адекватного Компаратора (который интерфейс)
//                List<AbstractFigure> abstractFigures = new ArrayList<>();
//                abstractFigures.add(new Square(FiguresType.SQUARE, "15"));
//                abstractFigures.add(new Circle(FiguresType.CIRCLE, "60"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "5"));
//                abstractFigures.add(new Circle(FiguresType.CIRCLE, "5"));
//                abstractFigures.add(new Circle(FiguresType.CIRCLE, "90"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "80"));
//                abstractFigures.add(new Circle(FiguresType.CIRCLE, "77"));
//                abstractFigures.add(new Rectangle(FiguresType.RECTANGLE, "2","3"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "66"));
//                abstractFigures.add(new Circle(FiguresType.CIRCLE, "11"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "10"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "9"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "2"));
//                System.out.println("Не сортированный");
//                abstractFigures.forEach(System.out::println);
//                Collections.sort(abstractFigures, new FiguresComparator());
//                System.out.println("Сортированный");
//                abstractFigures.forEach(System.out::println);
