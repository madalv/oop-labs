package lab8;

import java.util.List;

public class GeometricBodyController {

    public static GeometricBody getGeoBodyWithBiggestVolume(List<GeometricBody> geometricBodyList) {
        double maxVolume = geometricBodyList.get(0).getVolume();
        int indexOfGeoBody = 0;

        for (int i = 0; i < geometricBodyList.size(); i++) {
            double currVolume = geometricBodyList.get(i).getVolume();

            if (currVolume > maxVolume) {
                maxVolume = currVolume;
                indexOfGeoBody = i;
            }
        }

        return geometricBodyList.get(indexOfGeoBody);
    }

    public static GeometricBody getGeoBodyWithBiggestArea(List<GeometricBody> geometricBodyList) {
        double maxArea = geometricBodyList.get(0).getSurface();
        int indexOfGeoBody = 0;

        for (int i = 0; i < geometricBodyList.size(); i++) {
            double currVolume = geometricBodyList.get(i).getSurface();

            if (currVolume > maxArea) {
                maxArea = currVolume;
                indexOfGeoBody = i;
            }
        }

        return geometricBodyList.get(indexOfGeoBody);
    }
}

