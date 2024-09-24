package lab1;

public class Data {

	private int size = 0;
	private double sumOfValues = 0;
	private double maxValue = Integer.MIN_VALUE;

	Data() {

	}

	public void add(int x) {
		size++;
		sumOfValues += x;
		if (x > maxValue)
			maxValue = x;
	}

	public double getAverage() {
		if (size == 0)
			return 0.0;
		else
			return sumOfValues / size;
	}

	public double getMax() {
		return maxValue;
	}

	public String toString() {
		return String.format("Data storage:\nMax Value: %f\nAverage Value: %f", this.getMax(), this.getAverage());
	}
}
