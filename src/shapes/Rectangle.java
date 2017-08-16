package shapes;

import geoTools.CartesianPoint;

public class Rectangle extends AbstractShape {
	private double width;
	private double height;

	public Rectangle(CartesianPoint c, double x, double y) {
		super(c);
		width = x;
		height = y;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * width + 2 * height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String toString() {
		return "Rectangle centered in (" + this.getPosition().getX() + ","
				+ this.getPosition().getY() + ")";
	}

}
