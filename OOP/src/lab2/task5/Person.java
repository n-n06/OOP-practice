package lab2.task5;

import java.util.HashSet;
import java.util.Objects;
/*
 * 1. DO or DONT have pets done 
 * 2. leave pets to others done
 * 
 * */

/*
 * TODO:
 * 1. occupation, vacation done
 * 2. reistry done
 * 
 * */




public abstract class Person {
	private int age;
	private String name;
	private HashSet<Animal> pets = new HashSet<>();
	private boolean canProvideCare = true;
	private Person petsHolder = null;


  public Person(String name) {
    this.name = name;
  }

  public Person (String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  	public HashSet<Animal> getPets() {
  		return this.pets;
  	}

	public boolean assignPet(Animal pet) {
		try {
			if (pet.getDoesRequireCare() && !this.canProvideCare()) {
				throw new Exception(this.name + " cannot provide care to this pet");
			} else {
				this.pets.add(pet);
				if(pet.getOwner() == null) { //we only set owner on the very first assignment
					pet.setOwner(this); //it is possible for a pet to be in someone else's pets hashset but still have original owner
				}
				return true;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
//	public void removeAllPets() {
//		this.pets.clear();
//	}
	
	public void removePet(Animal pet) {
		this.pets.remove(pet);
	}
	
	public boolean hasPet() {
		return this.pets.size() > 0;
	}
	
	public void setCare(boolean canProvideCare) {
		this.canProvideCare = canProvideCare;
	}
	
	public boolean canProvideCare() {
		return this.canProvideCare;
	}
	
	public abstract String getOccupation();
	
	public void leavePetWith(Person p) {
		try {
			if (!this.hasPet()) {
				throw new Exception(this.name + " has no pets to leave!");
			} else if (this.petsHolder != null) {
				throw new Exception(this.name + " has already left their pets with someone and hasn't retrieved them yet");
			}
			else {
				HashSet<Animal> newPets = new HashSet<>(this.pets);
				for (Animal a : newPets) {
					if (p.assignPet(a)) {
						this.removePet(a);
						this.petsHolder = p;
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	
	public void retrievePetFrom(Person p) {
		HashSet<Animal> petsToRetrieve = new HashSet<>(p.pets);
		
		if (!this.petsHolder.equals(p)) {
			System.err.println(this.name + " did not leave their pets with " + p.name);
		}
		
		for(Animal a : petsToRetrieve) {
			if(a.getOwner().equals(this)) {
				this.assignPet(a);
				p.removePet(a);
			}
		}
		this.petsHolder = null;
	}	
	
	public void print() {
		System.out.println(this.toString());
	}
	
	
	public String toString() {
		return "name: " + name + ", age: " + age + ", pets: " + pets.toString();
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
		return Objects.hash(age, name, pets, canProvideCare);
	}
	
	
}
