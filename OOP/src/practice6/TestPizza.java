package practice6;

import java.util.Vector;

public class TestPizza {
	public static void main(String[] args) {
		Vector<CanHavePizza> v = new Vector<>();
		
		Pizza p = new Pizza(50, "Pepperoni");
		
		Student s = new Student("Nursultan", 18, "SITE");
		Cat c = new Cat("Neko", 5);
		
		v.add(c);
		v.add(s);
		
		for (CanHavePizza a : v) {
			System.out.println(a);
			a.eatPizza(p);
			System.out.println(a);
		}
	}

}
