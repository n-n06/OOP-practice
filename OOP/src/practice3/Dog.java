package practice3;

public class Dog extends Animal {
	Dog() {
		super();
	} 
	
	Dog(String name) {
		super(name);
	}
	
	Dog(String name, int age) {
		super(name, age);
	}
	
	Dog(String name, int age, FeedType ft) {
		super(name, age, ft);
	}
	
	public String spin(int times) {
		return super.spin().repeat(times);
	}
	
	public String toString() {
		return "Dog " + name + "\nAge " + age + "Feed Type " + feedingType;
	}
}
