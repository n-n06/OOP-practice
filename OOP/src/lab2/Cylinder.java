package lab2;

public class Cylinder extends Shape3D {
	private double radius, height;
	
	public Cylinder() {
		
	}
	
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
		return 2 * baseArea() + 2 * Math.PI * radius  * height;
	}

	
	public String toString() {
		return super.toString() + "Cylinder, radius: " + radius + ", height: " + height;
	}

	public boolean equals(Object o) {
		if (super.equals(o)) {
			Cylinder c = (Cylinder) o;
			return height == c.height && radius == c.radius; 
		}
		return false;
	}

	
}
