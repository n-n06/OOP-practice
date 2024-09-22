package lab1;

public class TemperatureTest {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature(100, TemperatureScale.F);
		temp1.setScale(TemperatureScale.C);
		System.out.println(temp1.getScale());

		temp1.setTemperature(100);
		System.out.println(temp1.getTemperatureF());

		temp1.setTemperatureScale(32, TemperatureScale.F);
		System.out.println(temp1);
		System.out.println(temp1.getTemperatureC());

	}

}
