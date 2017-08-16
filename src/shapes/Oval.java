package shapes;

import geoTools.CartesianPoint;

public class Oval extends AbstractShape {
	private double semiMajorAxis;
	private double semiMinorAxis;

	public Oval(CartesianPoint c, double a, double b) {
		super(c);
		this.semiMajorAxis = a;
		this.semiMinorAxis = b;
	}

	public double getArea() {
		return semiMajorAxis * semiMinorAxis * Math.PI;
	}

	public double getPerimeter() {
		// approximation
		return Math.PI
				* (3 * (semiMajorAxis + semiMinorAxis) - Math
						.sqrt((3 * semiMajorAxis + semiMinorAxis)
								* (semiMajorAxis + 3 * semiMinorAxis)));
	}

	public double getWidth() {
		return 2 * semiMajorAxis;
	}

	public double getHeight() {
		return 2 * semiMinorAxis;
	}

	public String toString() {
		return "Oval centered in (" + this.getPosition().getX() + ","
				+ this.getPosition().getY() + ")";
	}
}
