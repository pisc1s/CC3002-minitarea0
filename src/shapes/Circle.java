package shapes;

import geoTools.CartesianPoint;

public class Circle extends AbstractShape {
	private double radius;

	public Circle(CartesianPoint c, double r) {
		super(c);
		radius = r;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getWidth() {
		return 2 * radius;
	}

	@Override
	public double getHeight() {
		return 2 * radius;
	}

	@Override
	public String toString() {
		return "Circle centered in (" + this.getPosition().getX() + ","
				+ this.getPosition().getY() + ")";
	}

}
