package lab1;

public class CourseTest {

	public static void main(String[] args) {
		Course c1 = new Course("OOP", "Learn new paradigm and Java)", 5);
		c1.addPrerequisite(new Course("PP2", "Continue learning basics of programming in Python)", 5));

		System.out.print(c1.toString());

	}

}
