package lab2.task5;

public class TestPeople {

	public static void main(String[] args) {
		Person john = new Employee("John", 30, "Engineer");
		Person alice = new PhDStudent("Alice", 26, School.SITE, "AI");
		Animal murka = new Cat("Murka", 5);
		
		
		john.assignPet(murka); // John owns Murka
		
		john.print();
		System.out.println(john.canProvideCare());
		
		alice.print();
		System.out.println(alice.canProvideCare());
		
		PersonRegistry registry = new PersonRegistry();
		registry.addPerson(john);
		registry.addPerson(alice);
		registry.print();
		
		System.out.println();
		
		Animal pochita = new Dog("Pochita", 1000, "Chainsaw-terier");
		john.assignPet(pochita);
		Animal pochi2 = new Dog("Pochita", 1000, "Chainsaw-terier"); //check for equality in hashset
		john.assignPet(pochi2);
		
		john.print();
		
		john.leavePetWith(alice);
		
		john.removePet(pochita);

		
		john.print();
		alice.print(); //alice now has murka
		
		john.retrievePetFrom(alice);
		
		registry.print();
		
	}

}
