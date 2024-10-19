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
	private boolean canProvideCare = true;


  public Person(String name) {
    this.name = name;
  }

  public Person (String name, int age) {
    this.name = name;
    this.age = age;
  }

	public void assignPet(Animal pet) {
		try {
			if (pet.getDoesRequireCare() && !this.canProvideCare()) {
				throw new Exception(this.name + " cannot provide care to this pet");
			} else {
				this.pet = pet;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void removePet() {
		this.pet = null;
	}
	
	public boolean hasPet() {
		return this.pet != null;
	}
	
	public boolean canProvideCare() {
		return this.canProvideCare;
	}
	
	public abstract String getOccupation();
	
	public void leavePetWith(Person p) {
		try {
			if (!this.hasPet()) {
				throw new Exception(this.name + " has no pets to leave!");
			} else {
				p.assignPet(this.pet);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	
	
	public String toString() {
		return "name: " + name + ", age: " + age + ", pet: " + (pet == null ? "none" : pet.toString());
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Person p = (Person) o;
		return this.age == p.age &&
				this.name.equals(p.name);
		
	}
	
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	
}
