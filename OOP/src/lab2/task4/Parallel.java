package lab2.task4;

public class Parallel extends Circuit {
	Circuit[] subcircuits = new Circuit[2];
	
	public Parallel( Circuit a, Circuit b) {
		subcircuits[0] = a;
		subcircuits[1] = b;
	}
	
	@Override
	public double getResistance() {
		return 1 / (1 / subcircuits[0].getResistance() + 1 / subcircuits[1].getResistance());
	}

	@Override
	public double getPotentialDiff() {
		return subcircuits[0].getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		subcircuits[0].applyPotentialDiff(V);
		subcircuits[1].applyPotentialDiff(V);
	}

	@Override
	public String toString() {
		return "Parallel: [" + subcircuits[0] + ", " + subcircuits[1] + "]. " + super.toString();
	}
	

}
