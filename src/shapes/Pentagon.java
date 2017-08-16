package shapes;

import geoTools.CartesianPoint;

public class Pentagon extends AbstractRegularPolygon {

	public Pentagon(CartesianPoint c, int n, double s) {
		super(c, n, s);
	}

	@Override
	public double getArea() {
		return 1.72 * this.getWidth() * this.getWidth();
	}

	@Override
	public double getHeight() {
		return 2 * this.getWidth() / 1.45;
	}

}
