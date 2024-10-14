package lab2.task4;

import java.util.Objects;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	public double getPower() {
		return Math.pow(getPotentialDiff(), 2) / getResistance();
	}
	public double getCurrent() {
		return getPotentialDiff() / getResistance();
	}
	
	public String toString() {
		return "Total V = " + this.getPotentialDiff() + ", total R = " + this.getResistance();
	};
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Circuit c = (Circuit) o;
		return c.getPotentialDiff() == this.getPotentialDiff() && 
				c.getResistance() == this.getResistance() &&
				c.getCurrent() == this.getCurrent();
 	}
	
	public int hashCode() {
		return Objects.hash(getResistance(), getPotentialDiff());
	}
}
