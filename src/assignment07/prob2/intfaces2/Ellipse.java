package assignment08.prob2.intfaces2;

public class Ellipse implements ClosedCurve {
    private double semiaxis;
    private double elateral;

    public Ellipse(double semiaxis, double elateral) {
        this.semiaxis = semiaxis;
        this.elateral = elateral;
    }

    // Implement methods for majorRadius and minorRadius access (similar to Circle)

    @Override
    public double computePerimeter() {
        // You can implement a more complex formula for ellipse perimeter here
        // (e.g., using elliptic integral), but for simplicity, we'll use an approximation
        return Math.PI * (semiaxis + elateral);
    }
}