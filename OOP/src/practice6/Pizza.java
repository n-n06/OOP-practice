package practice6;

public class Pizza extends Food {
	private int nutrition;
	private String topping;
	
	public Pizza() {
		
	}
	
	public Pizza(int nutrition) {
		super(nutrition);
	}
	
	public Pizza(int nutrition, String topping) {
		this(nutrition);
		this.topping = topping;
	}
	
	public String toString() {
		return super.toString() + ", type: Pizza, topping: " + this.topping;
	}
}
