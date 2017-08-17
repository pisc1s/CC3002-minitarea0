package shapes;

import geoTools.CartesianPoint;

public class Circle extends Oval {

	public Circle(CartesianPoint c, double r) {
		super(c, r, r);
	}

}
