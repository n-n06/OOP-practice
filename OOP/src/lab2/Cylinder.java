package lab2;

public class Cylinder extends Shape3D {
	private double radius, height;
	
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}
	
	private double baseArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double volume() {
		return baseArea() * height;
	}

	
	@Override
	public double surfaceArea() {
		double l = Math.sqrt(radius * radius + height * height);
		return Math.PI * l * l + baseArea();
	}
	
}
