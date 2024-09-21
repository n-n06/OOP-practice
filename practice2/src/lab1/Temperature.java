package lab1;

public class Temperature {
	//fields
	private double temperatureValue = 0;
	private TemperatureScale scaleChar = TemperatureScale.C;		
	
	//constructors
	Temperature() {
		
	}
	
	Temperature(double temperature) {
		this.temperatureValue = temperature;
	}
	
	Temperature(TemperatureScale scaleChar) {
		this.scaleChar = scaleChar;
	}
	
	Temperature(double temperature, TemperatureScale scaleChar) {
		this(temperature);
		this.scaleChar = scaleChar;
	}
	
	//getters and setters
	public double getTemperatureC() {
		if (this.scaleChar == TemperatureScale.C) {
			return this.temperatureValue;
		} else {
			return (5 * (this.temperatureValue - 32)) / 9;
		}
	}
	
	public double getTemperatureF() {
		if (this.scaleChar == TemperatureScale.F) {
			return this.temperatureValue;
		} else {
			return (9 * this.temperatureValue) / 5 + 32;
		}
	}
	
	public TemperatureScale getScale() {
		return scaleChar;
	}
	
	public void setTemperature(double temperature) {
		this.temperatureValue = temperature;
	}
	
	public void setScale(TemperatureScale scale) {
		this.scaleChar = scale;
	}
	
	public void setTemperatureScale(double temperature, TemperatureScale scale) {
		setTemperature(temperature);
		setScale(scale);
	}
	
	//toString method
	public String toString() {
		return String.format("Temperature is at %.2f %s", this.temperatureValue, this.scaleChar);
	}
	
}
