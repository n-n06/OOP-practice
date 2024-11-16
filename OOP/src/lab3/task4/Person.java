package lab3.task4;

import java.util.Objects;

public abstract class Person {
	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String toString() {
		return "name " + name;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Person p = (Person) o;
		return this.name.equals(p.name);
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
}
