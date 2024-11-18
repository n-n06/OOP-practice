package lab2.task5;

public class TestPeople3 {
	public static void main(String[] args) { 
		PersonRegistry db = new PersonRegistry(new Employee("Bob", 42));
		
		Person thom = new Student("Thom", 20, School.SITE);
		
		thom.assignPet(new Bird("Kesha", 5));
		thom.assignPet(new Cat("Nyan Cat", 200));
		
		thom.addToBalance(300);
		
		Person mark = new PhDStudent("Mark", 23, School.SCE, "Neuromediators");
		mark.assignPet(new Cat("Puss in Boots", 14));
		

		Person john = new Employee("John", 30, "Engineer");
		Animal murka = new Cat("Murka", 5);
		john.assignPet(murka); // John owns Murka
//		mark.assignPet(new Dog("Snoop Doogg"));
		
		john.leavePetWith(thom);
		
		
		db.addPerson(thom);
		db.addPerson(mark);
		db.addPerson(john);
		
		db.print();
		
		db.collectTaxes();
		
		db.print();
		
		mark.print();
		
		mark.leavePetWith(thom);
		mark.assignPet(new Cat("Myoewy"));
		mark.print();
		
		john.retrievePetFrom(thom);
		db.print();
		
		db.callEveryontOut();
		
		
	}

}
