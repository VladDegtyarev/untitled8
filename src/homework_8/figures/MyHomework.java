package homework_8.figures;


public class MyHomework {
    public static void main(String[] args) {
        getFigure();
        System.out.println (getFigure());
    }
    public static String getFigure() {
        Figure[] figures = new Figure[]{
                new Triangle(12, 43, 43, 34),
                new Circle(12),
                new Rectangle(4, 2),
                new Circle(6),
                new Triangle(5, 5, 3, 2)
        };
        double sumPerimeter = 0;
        for (Figure index : figures) {
            sumPerimeter += index.calculatePerimeter();
        }
        return "Perimeter sum : "+sumPerimeter;



            }


        }







