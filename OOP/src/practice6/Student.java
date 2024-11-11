package practice6;

public class Student extends Person implements CanHavePizza {
	
	private String school;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, String school) {
		this(name, age);
		this.school = school;
	}
	
	public String getSChool() {
		return this.school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public void eatPizza(Pizza p) {
		this.fillHunger(p);
	}
	
	public String toString() {
		return "Student: " + super.toString() + ", school: " + school;
	}
	
}
