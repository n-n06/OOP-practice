package practice2;

public class Time implements Comparable<Time> {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public Time(int hour, int minute, int second) {
		this.hour = hour % 24 + minute / 60;
		this.minute = minute % 60 + second / 60;
		this.second = second % 60;
	}

	public Time add(Time t) {
		return Time.add(this, t);
	}

	public static Time add(Time t1, Time t2) {
		Time timeSum = new Time(t1.getHour() + t2.getHour(), t1.getMinute() + t2.getMinute(),
				t1.getSecond() + t2.getSecond());
		return timeSum;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public void setHour(int hour) {
		this.hour = hour % 24;
	}

	public void setMinute(int minute) {
		this.minute = minute % 60;
		this.hour += minute / 60;
	}

	public void setSecond(int second) {
		this.second = second % 60;
		this.minute += second / 60;
		this.hour += minute / 60;
	}

	public String toUniversal() {
		return "" + this.hour + ":" + this.minute + ":" + this.second;
	}

	public String toStandard() {
		String standardTime = "" + this.hour % 12 + ":" + this.minute + ":" + this.second;
		if (this.hour / 12 > 0) {
			standardTime += " AM";
		} else {
			standardTime += " PM";
		}
		return standardTime;
	}

	public String toString() {
		return toUniversal();
	}

	@Override
	public int compareTo(Time o) {
		int hourComp = Integer.compare(this.hour, o.hour);
		if (hourComp == 0) {
			int minComp = Integer.compare(this.minute, o.minute);
			if (minComp == 0) {
				return Integer.compare(this.second, o.second);
			}
			return minComp;
		} 
		return hourComp;
	}
}
