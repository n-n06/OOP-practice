package lab2.task5;


public class Student extends Person {
  private School school;

  public Student(String name) {
    super(name);
  }

  public Student(String name, int age) {
    super(name, age);
  }

  public Student(String name, School school) {
    this(name);
    this.school = school;
  }

  public Student(String name, Animal pet) {
    super(name, pet);
  }

  public Student(String name, int age, Animal pet) {
    super(name, age, pet);
  }

  public Student(String name, int age, School school) {
    this(name, age);
    this.school = school;
  }

  public Student(String name, int age, School school, Animal pet) {
    this(name, age, pet);
    this.school = school; 
  }




	@Override
	public String getOccupation() {
		// TODO Auto-generated method stub
		return null;
	}

}
