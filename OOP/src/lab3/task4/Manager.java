package lab3.task4;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Cloneable {
	private double bonus = 0;
	private Vector<Employee> team = new Vector<>();
	
	public Manager() {
		
	}
	
	public Manager(String name) {
		super(name);
	}
	
	public Manager(String name, double salary) {
		super(name, salary);
	}
	
	public Manager(String name, String insuranceNumber) {
		super(name, insuranceNumber);
	}
	
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		setBonus(bonus);
	}
	
	public Manager(String name, double salary, String insuranceNumber) {
		super(name, salary, insuranceNumber);
	}
	
	public Manager(String name, double salary, double bonus, String insuranceNumber) {
		super(name, salary, insuranceNumber);
		setBonus(bonus);
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		if (bonus < 0) {
			System.err.println("Please provide non-negative bonus salary value");
			return;
		}
		this.bonus = bonus;
	}
	
	public Vector<Employee> getTeam() {
		return team;
	}
	
	public void setTeam(Vector<Employee> team) {
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Manager " + super.toString().replace("]", "") + 
				String.format(", salary bonus: %.2f", bonus) + 
				", team: " + this.team + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Manager m = (Manager) o;
		return this.bonus == m.bonus &&
				this.team.equals(m.team);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(bonus, team);
	}
	
	@Override
	public int compareTo(Employee o) {
		Manager m = (Manager) o;
		if (super.compareTo(o) == 0) {
			return Double.compare(this.bonus, m.bonus);
		} else {
			return super.compareTo(o);
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager) super.clone();
		m.team = new Vector(this.team);
		return m;
	}
	
	
}
