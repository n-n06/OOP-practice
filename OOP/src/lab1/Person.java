package lab1;

public class Person {

	private String name;
	private int age;
	private Gender gender;

	// constructors

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(Gender gender) {
		this.gender = gender;
	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	public Person(String name, Gender gender) {
		this(name);
		this.gender = gender;
	}

	public Person(String name, int age, Gender gender) {
		this(name, age);
		this.gender = gender;
	}
	
	//getters and setters

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return this.gender;
	}
	
	// toString

	public String toString() {
		return String.format("Person\nName: %s\nAge: %d\nGender: %s", this.name, this.age, this.gender);
	}
}
