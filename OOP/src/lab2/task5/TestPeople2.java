package lab2.task5;

public class TestPeople2 {
	public static void main( String args[] ) {
		Person thom = new Student("Thom", 20, School.SITE);
		
		thom.assignPet(new Bird("Kesha", 5));
		thom.assignPet(new Cat("Nyan Cat", 200));
		
		for (Animal a : thom.getPets()) {
			System.out.println(a + " " +  a.getSound());
		}
		System.out.println();
		
		thom.print();
		
		Person mark = new PhDStudent("Mark", 23, School.SCE, "Neuromediators");
		
		mark.assignPet(new Dog("Snoop Doogg"));
		mark.assignPet(new Cat("Puss in Boots", 14));
		mark.print();
		
		thom.leavePetWith(mark);

		//zuck know everything
		PersonRegistry zucksDB = new PersonRegistry(); 
		zucksDB.addPerson(mark);
		zucksDB.addPerson(thom);
		
		zucksDB.print();
		
		thom.retrievePetFrom(mark);
		
		zucksDB.print();
		
		Person ducky = new Employee("Ducky", 30, "KFC cashier");
		zucksDB.addPerson(ducky);
		
		System.out.println();
		
		for (Person p : zucksDB.getRegistry()) {
			System.out.println(p.getOccupation());
		}
		
		System.out.println(zucksDB.dontHavePets());
		
		zucksDB.removePerson(new Employee("Ducky", 30, "KFC cashier"));
		zucksDB.print();
		
		
	}
}
