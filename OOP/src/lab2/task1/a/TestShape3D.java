package lab2.task1.a;

import java.util.Vector;

public class TestShape3D {

	public static void main(String[] args) {
		Cylinder hat = new Cylinder(3,6);
		Cube cube = new Cube(5);
		Sphere ball = new Sphere(4);
		
		Vector<Shape3D> shapeList = new Vector<Shape3D>();
		shapeList.add(hat);
		shapeList.add(cube);
		shapeList.add(ball);
		
		
		for (Shape3D s : shapeList) {
			System.out.println(s);
			System.out.println("Volume: " + s.volume());
			System.out.println("Surface area: " + s.surfaceArea());
		}

	}

}
