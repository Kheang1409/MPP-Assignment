package assignment08.prob2.intfaces2;

public interface Polygon extends ClosedCurve{

    double[] getLength();

    default double computePerimeter() {
        double[] sides = getLength();
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
