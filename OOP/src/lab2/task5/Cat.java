package lab2.task5;


public class Cat extends Animal {
	
	public Cat() {
		
	}
	
	public Cat(String name) {
		super(name);
	}
	
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public String getSound() {
		return "Nyan! Nyan!";
	}

	public String toString() {
		return "Cat: " + super.toString();
	}
}
