package lab2.task1;

public class Box {

    private double height;
    private double width;
    private double length;

    Box() {
        height = 1;
        width = 1;
        length = 1;
    }

    Box (double param) {
        height = param;
        width = param;
        length = param;
    }

    Box (double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return 2 * (height * width + height * length + length * width);
    }

    public double getVolume() {
        return length * width * height;
    }
}
