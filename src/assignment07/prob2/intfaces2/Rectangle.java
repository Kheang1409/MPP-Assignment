package assignment08.prob2.intfaces2;

public class Rectangle implements Polygon {
	private double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double computePerimeter() {
		return 2 * length + 2 * width;
	}
	
	
	public double[] getLength() {
		return new double[] {length};
	}
}
