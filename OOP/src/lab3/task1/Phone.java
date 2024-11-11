package lab3.task1;

public class Phone implements Sellable {
	private double price = 0.0;
	private String model;
	private BankAccount owner;
	
	public Phone() {
		
	}
	
	public Phone(String model) {
		this.model = model;
	}
	
	public Phone(String model, double price) {
		this(model);
		this.setPrice(price);
	}

	@Override
	public void sell(BankAccount ba) {
		this.owner = ba;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
		
	}
	
	public String toString() {
		return "Phone : [model: " + model +  String.format(", price: %.2f]", price);
	}
	
}
