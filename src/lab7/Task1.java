package lab7;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        // ------------------------------------------- medium task
        Figure square1 = new Square(2.3);
        Figure rectangle1 = new Rectangle(2, 3.4);
        Figure triangle1 = new Triangle(1, 3, 1.45);
        Figure square2 = new Square(6.66);

        // adding figures to list
        List<Figure> figureList = new ArrayList<>();
        figureList.add(square1);
        figureList.add(square2);
        figureList.add(rectangle1);
        figureList.add(triangle1);

        // getting figures with max area and perimeter
        Figure figureWithBiggestArea = FigureController.getFigureWithBiggestArea(figureList);
        Figure figureWithBiggestPerimeter = FigureController.getFigureWithBiggestPerimeter(figureList);

        // printing results in console
        System.out.println(" --- FIRST RUN ---");
        System.out.println("Figure with biggest area: ");
        System.out.println(figureWithBiggestArea.toString());
        System.out.println("Figure with biggest perimeter: ");
        System.out.println(figureWithBiggestPerimeter.toString());

        // ------------------------------------------- advanced task
        // anonymous circle class
        Figure circle = new Figure() {
            private double radius = 12.3;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return Math.PI * 2 * radius;
            }

            @Override
            public String toString(){
                return  "circle: \n" +
                        "radius = " + radius + "\n" +
                        "area = " + getArea() + "\n" +
                        "circumference = " + getPerimeter() + "\n";
            }
        };

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Circumference of circle: " +circle.getPerimeter());

        figureList.add(circle);

        figureWithBiggestArea = FigureController.getFigureWithBiggestArea(figureList);

        // printing results in console
        System.out.println(" --- SECOND RUN ---");
        System.out.println("Figure with biggest area: ");
        System.out.println(figureWithBiggestArea.toString());
    }
}
