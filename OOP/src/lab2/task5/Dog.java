package lab2.task5;

import java.util.Objects;

public class Dog extends Animal {
	private String breed; //nirvana reference)
	
	{
		setCare(true);
	}
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public Dog(String name, String breed) {
		super(name);
		setBreed(breed);
	}
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public Dog(String name, int age, String breed) {
		this(name, age);
		setBreed(breed);
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		 this.breed = breed;
	}
	
	@Override
	public String getSound() {
		return "Bark! Bark!";
	}
	
	public String toString() {
		return "Dog: " + super.toString() + ", breed: " + breed;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Dog a = (Dog) o;
		return a.breed.equals(this.breed);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(breed);
	}

}
