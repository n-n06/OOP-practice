package lab3.task2;

public class F1Balid extends Machine implements CanAccelerate {
	private double ax, ay;
	
	@Override
	public void move(double dx, double dy) {
		super.move(dx + ax, dy + ay);
	}

	@Override
	public void setAcceleration(double ax, double ay) {
		this.ax = ax;
		this.ay = ay;
	}

	@Override
	public double getXAcceleration() {
		return ax;
	}

	@Override
	public double getYAcceleration() {
		return ay;
	}

}
