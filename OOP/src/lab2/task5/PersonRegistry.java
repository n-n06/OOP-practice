package lab2.task5;

import java.util.Vector;

public class PersonRegistry {
	private Vector<Person> v;
	
	public PersonRegistry() {
		v = new Vector<>();
	}
	
	public PersonRegistry(Vector <Person> people) {
		v = people;
	}
	
	public Vector<Person> getRegistry() {
		return v;
	}
	
	public void addPerson(Person p) {
		v.add(p);
	}
	
	public void removePerson(Person p) {
		v.remove(p);
	}
	
	public Vector<Person> havePets() {
		Vector<Person> new_v = new Vector<>();
		for (Person p : v) {
			if (p.hasPet()) {
				new_v.add(p);
			}
		}
		return new_v;
	}
	
	public Vector<Person> dontHavePets() {
		Vector<Person> new_v = new Vector<>();
		for (Person p : v) {
			if (!p.hasPet()) {
				new_v.add(p);
			}
		}
		return new_v;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return v.toString();
	}
}

