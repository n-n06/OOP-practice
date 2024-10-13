package lab2.task4;

public class Series extends Circuit {
	Circuit[] subcircuits = new Circuit[2];
	
	public Series( Circuit a, Circuit b) {
		subcircuits[0] = a;
		subcircuits[1] = b;
	}
	
	public double getCurrent(double V) {
		return V / this.getResistance();
	}
	
	@Override
	public double getResistance() {
		return subcircuits[0].getResistance() + subcircuits[1].getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return subcircuits[0].getPotentialDiff() + subcircuits[1].getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		double I = getCurrent(V); //total new current (the same across series connection)
		
		subcircuits[0].applyPotentialDiff(I * subcircuits[0].getResistance());
		subcircuits[1].applyPotentialDiff(I * subcircuits[0].getResistance());
		
	}

	@Override
	public String toString() {
		return "Series: [" + subcircuits[0] + ", " + subcircuits[1] + "]. " + super.toString();
	}

}
