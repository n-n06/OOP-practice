package lab2.task5;

import java.util.Objects;

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
	
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String getOccupation() {
		return job;
	}
	
	public String toString() {
		return "Employee: " + super.toString() + ", job: " + job;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Employee e = (Employee) o;
		return e.job.equals(this.job);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(this.job);
	}
	
	

}
