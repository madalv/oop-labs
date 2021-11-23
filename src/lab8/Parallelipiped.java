package lab8;

// gonna assume this is a rectangular parallelipiped for simplicity
public class Parallelipiped implements GeometricBody {

    private double length;
    private double width;
    private double height;

    public Parallelipiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString(){
        return "parallelipiped:\n" +
                "length: " + length + "\n" +
                "width: " + width + "\n" +
                "height: " + height + "\n" +
                "surface area: " + getSurface() + "\n" +
                "volume: " + getVolume() + "\n";
    }
}
