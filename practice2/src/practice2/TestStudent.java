package practice2;

public class TestStudent {

	public static void main(String[] args) {
		Student nurs = new Student("Nursultan");
		System.out.println(nurs);
		
		nurs.incrementYear();
		System.out.println("Now " + nurs.getName() + " with ID " + nurs.getId()  + " is on his " + nurs.getYear() + " year of study");
		
		Student somename = new Student("Somename", 3);
		System.out.println(somename);
	}

}
