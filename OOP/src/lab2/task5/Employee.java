package lab2.task5;

public class Employee extends Person {
	private String job;
	
	
	public Employee(String name) {
	  super(name);
	}
	
	public Employee(String name, int age) {
	  super(name, age);
	}
	
	public Employee(String name, String job) {
	  this(name);
	  this.job = job;
	}
	
	public Employee(String name, int age, String job) {
	  this(name, age);
	  this.job = job;
	}
	
	public void setJob(String jo) {
		this.job = job;
	}

	@Override
	public String getOccupation() {
		return job;
	}
	
	

}
