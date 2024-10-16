package practice4;

public class Circle extends Shape {
	private double radius;
	
	public Circle(int pos, Color color) {
		super(pos, color);
	}
	
	public Circle(int pos, Color color, double radius) {
		this(pos, color);
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
		if (color == Color.BLACK) {
			System.out.println("●");
		} else {
			System.err.println("●");
		}
	}
	
	public String toString() {
		return "Circle" + super.toString();
	}
}