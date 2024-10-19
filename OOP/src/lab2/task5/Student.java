package lab2.task5;

import java.util.Objects;

public class Student extends Person {
	private School school;
	
	public Student(String name) {
	  super(name);
	}
	
	public Student(String name, int age) {
	  super(name, age);
	}
	
	public Student(String name, School school) {
	  this(name);
	  this.school = school;
	}
	
	public Student(String name, int age, School school) {
	  this(name, age);
	  this.school = school;
	}

	public void setSchool(School school) {
	  this.school = school;
	}

	@Override
	public String getOccupation() {
		return school.toString();
	}
	
	public String toString() {
		return "Student: " + super.toString() + ", school: " + school;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Student s = (Student)o;
		return s.school == this.school;
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(school);
 	}

}
