package lab2.task5;

import java.util.Objects;

public class PhDStudent extends Student {
	private String fieldOfResearch;

//	int numOfPublications = 0;
	
	{
		this.setCare(false);
	}

	public PhDStudent(String name) {
		super(name);
	}
	
	public PhDStudent(String name, School school) {
		super(name, school);
	}
		
	public PhDStudent(String name, int age) {
	  super(name, age);
	}
	
	public PhDStudent(String name, int age, School school) {
		super(name, age, school);
	}
	
	public PhDStudent(String name, int age, String field) {
	  this(name, age);
	  this.setFieldOfStudy(field);
	}
	
	public PhDStudent(String name, int age, School school, String field) {
		super(name, age, school);
		this.setFieldOfStudy(field);
	}
	
	
	public String getFieldOfStudy() {
		return this.fieldOfResearch;
	}
	
	public void setFieldOfStudy(String field) {
		this.fieldOfResearch = field;
	}
	
	public String toString() {
		return "PhD" + super.toString() + ", field of study: " + this.fieldOfResearch;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		PhDStudent p = (PhDStudent) o;
		return this.fieldOfResearch.equals(p.fieldOfResearch);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(this.fieldOfResearch);
	}
	//not allowed to have dogs
}
