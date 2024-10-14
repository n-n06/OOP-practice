package lab2.task5;

import java.util.Objects;
/*
 * 1. DO or DONT have pets
 * 2. leave pets to others
 * 
 * */

/*
 * TODO:
 * 1. occupation, vacation login
 * 2. reistry
 * 
 * */



public abstract class Person {
	private int age;
	private String name;
	private Animal pet = null;
	
	public void assignPet(Animal pet) {
		this.pet = pet;
	}
	
	public void removePet() {
		this.pet = null;
	}
	
	public boolean hasPet() {
		return this.pet != null;
	}
	
	public abstract String getOccupation();
	
	public String toString() {
		return "name: " + name + ", age: " + age + ", pet: " + (pet == null ? "none" : pet.toString());
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Person p = (Person) o;
		return this.age == p.age &&
				this.name.equals(p.name) &&
				this.pet.equals(p.pet);
		
	}
	
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	
}
