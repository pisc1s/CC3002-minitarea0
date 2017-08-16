package shapes;

import geoTools.CartesianPoint;

public class Square extends AbstractShape {
	private double side;

	public Square(CartesianPoint c, double a) {
		super(c);
		side = a;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public double getWidth() {
		return side;
	}

	@Override
	public double getHeight() {
		return side;
	}

	@Override
	public String toString() {
		return "Square centered in (" + this.getPosition().getX() + ","
				+ this.getPosition().getY() + ")";
	}

}
