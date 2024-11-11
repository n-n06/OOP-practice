package practice6;

public abstract class Person {
	public String name;
	public int age;
	public int hunger = 0;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
  }

	  public void setName(String name) {
	    this.name = name;
	  }
	
	  public int getAge() {
	    return this.age;
	  }
	
	  public void setAge(int age) {
	    this.age = age;
	  }
	
	  public int getHunger() {
	    return this.hunger;
	  }
	  
	  public void fillHunger(Food f) {
		  this.hunger += f.getNutrition();
	  }
	  
	  public String toString() {
		  return "name: " + name + ", age: " + age +  ", hunger: " + hunger;
	  }
}
