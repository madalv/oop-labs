package lab7;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }


    @Override
    public String toString(){
        return  "rectangle: \n" +
                "length = " + length + "\n" +
                "width = " + width + "\n" +
                "area = " + getArea() + "\n" +
                "perimeter = " + getPerimeter() + "\n";
    }
}
