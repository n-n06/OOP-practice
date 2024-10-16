package practice4;

public class Rectangle extends Shape {
	private int a,b;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int pos, Color color) {
		super(pos, color);
	}
	
	public Rectangle(int pos, Color color, int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void draw() {
		super.draw();
		if (color == Color.BLACK) {
			System.out.println("▬");
		} else 
			System.err.println("▬");
		}		
	}
}
