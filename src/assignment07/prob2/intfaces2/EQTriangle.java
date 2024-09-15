package assignment08.prob2.intfaces2;

public class EQTriangle implements Polygon{

    private double side;

    public EQTriangle(double side){
        this.side = side;
    }
    @Override
    public double[] getLength() {
        return new double[]{side};
    }
    @Override
    public double computePerimeter() {
        return 3 * side; // Perimeter of equilateral triangle
    }
}
