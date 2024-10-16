package practice4;

import java.util.Vector;

public class TestShape {

	public static void main(String[] args) {
		Circle c1 = new Circle(3, Color.RED);
		Circle c2 = new Circle(4, Color.BLACK);
		Triangle t1 = new Triangle(5, Color.RED);
		Triangle t2 = new Triangle(10, Color.BLACK);
		
		
		Vector<Shape> v = new Vector<>();
		v.add(c1);
		v.add(c2);
		v.add(t1);
		v.add(t2);
		
		for (Shape s :v) {
			s.draw();
		}
	}

}
