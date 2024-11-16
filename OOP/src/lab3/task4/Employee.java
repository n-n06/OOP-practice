package lab3.task4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable <Employee>, Cloneable{
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	{
		hireDate = new Date();
	}
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, double salary) {
		this(name);
		setSalary(salary);
	}
	
	public Employee(String name, String insuranceNumber) {
		this(name);
		this.insuranceNumber = insuranceNumber;
	}
	
	public Employee(String name, double salary, String insuranceNumber) {
		this(name, salary);
		this.insuranceNumber = insuranceNumber;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if (salary < 0) {
			System.err.println("Please provide non-negative salary value!");
			return;
		}
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee: [" + super.toString() + 
				", insurance number: " + insuranceNumber + 
				String.format(", salary: %.2f", salary) + 
				", hire date: " + hireDate + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Employee e = (Employee) o;
		return e.salary == this.salary &&
				e.insuranceNumber.equals(this.insuranceNumber) &&
				e.hireDate.equals(this.hireDate);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(salary, insuranceNumber, hireDate);
	}

	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.salary, o.salary);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee employeeClone =  (Employee) super.clone();
		employeeClone.hireDate = new Date();
		return employeeClone;
	}
	
}
