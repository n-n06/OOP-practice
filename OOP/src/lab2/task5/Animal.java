package lab2.task5;

import java.util.Objects;

public abstract class Animal {
	private String name;
	private int age = 0;
	private Person owner;
	
	private boolean doesRequireCare = false;
	
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
	
	public abstract String getSound();
	
	public Person getOwner() {
		return this.owner;
	}
	
	public void setOwner(Person p) {
		this.owner = p;
	}
	
	public boolean getDoesRequireCare() {
		return this.doesRequireCare;
	}
	
	public void setCare(boolean c) {
		this.doesRequireCare = c;
	}
	
	public String toString() {
		return "name: " + name + ", age: " + age;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == null) return true;
		if (this.getClass() != o.getClass()) return false;
		
		Animal a = (Animal) o;
		return this.age == a.age && this.name.equals(a.name) && this.doesRequireCare == a.doesRequireCare;
	}
	
	public int hashCode() {
		return Objects.hash(age, name);
	}

}
