package practice4;

public class Triangle extends Shape {
	private int a,b,c;
	
	public Triangle() {
		
	}
	
	public Triangle(int pos, Color color) {
		super(pos, color);
	}
	
	public Triangle(int pos, Color color, int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void draw() {
		super.draw();
		if (color == Color.BLACK) {
			System.out.println("▲");
		} else {
			System.err.println("▲");
		}
	}

	public String toString() {
		return "Triangle: " + super.toString();
	}
}
