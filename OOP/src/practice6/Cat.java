package practice6;

public class Cat extends Animal implements CanHavePizza, HungerLevel {
	  public Cat() {
	
	  }
	
	  public Cat(String name, int age) {
	    super(name, age);
	  }

	 public String sound() {
		 return "Nyan";
	 }
	  
	@Override
	public void eatPizza(Pizza p) {
		this.fillHunger(p);
		System.out.println(this.sound());
	}
	
	public String toString() {
		return "Cat: " + super.toString();
	}

	@Override
	public void setHungerLevel(int hungerLevel) {
		// TODO Auto-generated method stub
		this.hunger = HungerLevel.AVG_LEVEL;
	}

	@Override
	public int getHungerLevel() {
		// TODO Auto-generated method stub
		return hunger;
	}

}
