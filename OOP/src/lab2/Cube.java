package lab2;

public class Cube extends Shape3D {
	private double side;
	
	public Cube(double a) {
		this.side = a;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double a) {
		side = a;
	}
	
	private double squareArea() {
		return side * side;
	}
	
	@Override
	public double volume() {
		return Math.pow(side, 3);
	}

	@Override
	public double surfaceArea() {
		return 6 * squareArea();
	}

}
