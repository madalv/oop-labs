package lab8;

public class Sphere implements GeometricBody{

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString(){
        return "sphere:\n" +
                "radius: " + radius + "\n" +
                "surface area: " + getSurface() + "\n" +
                "volume: " + getVolume() + "\n";
    }
}
