package lab7;

public class Triangle extends Figure{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString(){
        return "triangle: \n" +
                "a = " + a + "\n" +
                "b = " + b + "\n"+
                "c = " + c + "\n" +
                "area = " + getArea() + "\n" +
                "perimeter = " + getPerimeter() + "\n";
    }
}
