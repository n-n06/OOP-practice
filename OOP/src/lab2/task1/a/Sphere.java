package lab2.task1.a;

public class Sphere extends Shape3D {
	private double radius;
	
	public Sphere() {
		
	}
	
	public Sphere(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	private double circleArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double volume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double surfaceArea() {
		return 4 * circleArea();
	}
	
	public String toString() {
		return super.toString() + "Sphere, radius: " + radius;
	}

}
