package lab3.task2;

import java.util.Objects;

public abstract class Animal implements Moveable {
	private String name;
	private int age = 0;
	private double x, y;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		setName(name);
	}
	
	public Animal(String name, int age) {
		this(name);
		setAge(age);
	}

	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public String toString() {
		return "name: " + name + ", age: " + age;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (this.getClass() != o.getClass()) return false;
		
		
		
		Animal a = (Animal) o;
		return this.age == a.age && 
				this.name.equals(a.name);
	}
	
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	

}
