package lab3.task1;

public interface Sellable {
	public void sell(BankAccount ba);
	public double getPrice();
	public void setPrice(double price);
}
