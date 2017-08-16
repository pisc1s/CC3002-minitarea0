package shapes;

import geoTools.CartesianPoint;

public class Triangle extends AbstractRegularPolygon {

	public Triangle(CartesianPoint c, int n, double s) {
		super(c, n, s);
	}

	@Override
	public double getArea() {
		return this.getWidth() * this.getWidth() * Math.sqrt(3) / 4;
	}

	@Override
	public double getHeight() {
		return this.getWidth() * Math.sqrt(3) / 2;
	}

}
