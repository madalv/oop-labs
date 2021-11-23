package lab7;

import java.util.List;

public class FigureController {

    public static Figure getFigureWithBiggestArea(List<Figure> figures) {

        double maxArea = figures.get(0).getArea();
        int indexOfFig = 0;

        for (int i = 0; i < figures.size(); i++) {
            double currArea = figures.get(i).getArea();

            if (currArea > maxArea) {
                maxArea = currArea;
                indexOfFig = i;
            }
        }

        return figures.get(indexOfFig);
    }

    public static Figure getFigureWithBiggestPerimeter(List<Figure> figures) {

        double maxPerimeter = figures.get(0).getPerimeter();
        int indexOfFig = 0;

        for (int i = 0; i < figures.size(); i++) {
            double currArea = figures.get(i).getPerimeter();

            if (currArea > maxPerimeter) {
                maxPerimeter = currArea;
                indexOfFig = i;
            }
        }

        return figures.get(indexOfFig);
    }
}
