package practice6;

public abstract class Food {
	private int nutrition;
	
	public Food() {
		
	}
	
	public Food(int nutrition) {
		this.nutrition = nutrition;
	}
	
	public int getNutrition() {
		return this.nutrition;
	}
	
	public String toString() {
		return "Food: nutrition: " + this.nutrition;
	}
}
