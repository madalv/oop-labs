package lab7;

public class Square extends Figure{

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }


    @Override
    public String toString(){
        return  "square: \n" +
                "length = " + length + "\n" +
                "area = " + getArea() + "\n" +
                "perimeter = " + getPerimeter() + "\n";
    }
}
