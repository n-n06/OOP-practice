package practice3;

import java.util.Vector;

public class Person {
	private String name;
	private String address;
	private static Vector<Person> userList = new Vector<>();
	
	Person() {
		userList.add(this);
	}
	
	Person(String name) {
		this();
		this.name = name;
	}
	
	Person(String name, String address) {
		this(name);
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return String.format("Person[name=%s, address=%s]", this.getName(), address);
	}
	
	public static String getAllUsers() {
		Vector<String> info = new Vector<>();
		for (Person p : userList) {
			info.add(p.toString());
		}
		return String.join("\n", info);
	}
}
