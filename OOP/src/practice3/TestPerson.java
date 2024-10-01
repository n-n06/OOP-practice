package practice3;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		input.useDelimiter("\n");
		
		while (true) {
			System.out.print("Enter either Person, Student or Staff or Q to quit: ");
			String choice = input.nextLine();
			
			if (choice.equals("Person")) {
					System.out.println("Name: ");
					String name = input.nextLine();
//					name = input.nextLine();
					System.out.println("Address: ");
					String address = input.nextLine();
					
					Person p = new Person(name, address);
					
					continue;
			} else if (choice.equals("Student")) {
					System.out.println("Name: ");
					String name = input.nextLine();
//					name = input.nextLine()
					System.out.println("Address: ");
					String address = input.nextLine();
					System.out.println("Program: ");
					String program = input.nextLine();
					System.out.println("Year: ");
					int year = Integer.parseInt(input.nextLine());
					System.out.println("Fee: ");
					double fee = Double.parseDouble(input.nextLine());
					
					Student s = new Student(name, address, program, year, fee);
					continue;
			} else if (choice.equals("Staff")) {

					System.out.println("Name: ");
					String name = input.nextLine();
//					name = input.nextLine();
					System.out.println("Address: ");
					String address = input.nextLine();
					System.out.println("School: ");
					String school = input.nextLine();
					System.out.println("Pay: ");
					double pay = Double.parseDouble(input.nextLine());
					
					Staff st = new Staff(name, address, school, pay);
					continue;
			} else if (choice.equals("Q")) {
				break;
			} else {
				System.err.println(choice);
				System.err.println("Please, input valid class names");
			}
		}
		
//		Person p = new Person("John");
//		Student s = new Student("Sherlock", "Baker Street, 221B", "IS", 1, 10000);
//		Staff sf = new Staff("Mary", "Faraway Town", "School of Applied Mathematics", 20000);
		
		System.out.println(Person.getAllUsers());

		input.close();
	}

}
