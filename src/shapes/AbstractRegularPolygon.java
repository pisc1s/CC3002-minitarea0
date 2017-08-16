package shapes;

import geoTools.CartesianPoint;

public abstract class AbstractRegularPolygon extends AbstractShape {
	private int numberOfSides;
	private double side;

	public AbstractRegularPolygon(CartesianPoint c, int n, double s) {
		super(c);
		numberOfSides = n;
		side = s;
	}

	@Override
	public abstract double getArea();

	@Override
	public double getPerimeter() {
		return numberOfSides * side;
	}

	@Override
	public double getWidth() {
		return side;
	}

	@Override
	public abstract double getHeight();

	@Override
	public String toString() {
		return "Regular polygon centered in (" + this.getPosition().getX()
				+ "," + this.getPosition().getY() + ")";
	}

}
