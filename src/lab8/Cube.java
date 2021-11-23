package lab8;

public class Cube implements GeometricBody{

    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double getSurface() {
        return 6 * length * length;
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }

    @Override
    public String toString(){
        return "cube:\n" +
                "side: " + length + "\n" +
                "surface area: " + getSurface() + "\n" +
                "volume: " + getVolume() + "\n";
    }
}
