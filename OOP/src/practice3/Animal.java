package practice3;

public class Animal {
	protected String name;
	protected int age;
	protected FeedType feedingType;
	
	Animal() {
		age = 0;
	}
	
	Animal(String name) {
		this.name = name;
	}
	
	Animal(int age) {
		this.age = age;
	}
	
	Animal(FeedType ft) {
		this.feedingType = ft;
	}
	
	Animal(String name, int age) {
		this(name);
		this.age = age;
	}
	
	Animal(String name, FeedType ft) {
		this(name);
		this.feedingType = ft;
	}
	
	Animal(String name, int age, FeedType ft) {
		this(name, age);
		this.feedingType = ft;
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
	
	public FeedType getFeeding() {
		return this.feedingType;
	}
	
	public void setFeeding(FeedType ft) {
		this.feedingType = ft;
	}
	
	public String spin() {
		return "Kuru kuru~~~";
	}
	
	
	public String toString() {
		return "Animal " + name + "\nAge " + age + "\nFeed type " + feedingType;
	}
}
