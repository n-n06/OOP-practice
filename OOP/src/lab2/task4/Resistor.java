package lab2.task4;

public class Resistor extends Circuit {
	private double resistance;
	private double potentialDiff;
	
	public Resistor(double R) {
		resistance = R;
	}
	
	public double getResistance() {
		return resistance;
	}

	@Override
	public double getPotentialDiff() {
		return potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.potentialDiff = V;
	}

	@Override
	public String toString() {
		return "Resistor: R = " + resistance + " Ohm, V = " + potentialDiff + " V";
	}
	
}
