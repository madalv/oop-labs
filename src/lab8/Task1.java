package lab8;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        // ------------------------------------------- basic task
        List<GeometricBody> geometricBodyList = new ArrayList<>();
        GeometricBody cube1 = new Cube(3.44);
        GeometricBody sphere1 = new Sphere(2.325);
        GeometricBody cuboid1 = new Parallelipiped(2, 3, 2.65);

        geometricBodyList.add(cube1);
        geometricBodyList.add(sphere1);
        geometricBodyList.add(cuboid1);

        // ------------------------------------------- medium task
        GeometricBody bodyWithBiggestVolume = GeometricBodyController.getGeoBodyWithBiggestVolume(geometricBodyList);
        GeometricBody bodyWithBiggestArea = GeometricBodyController.getGeoBodyWithBiggestArea(geometricBodyList);

        System.out.println("Geometric body with biggest volume:");
        System.out.println(bodyWithBiggestVolume.toString());
        System.out.println("Geometric body with biggest surface area:");
        System.out.println(bodyWithBiggestArea.toString());
    }
}
