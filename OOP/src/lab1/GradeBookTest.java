package lab1;

import practice2.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Course oop = new Course("CS101 Object-oriented Programming and design",
				"This course teaches the basics of OOP as a paradigm and fundamentals of Java", 5);

		GradeBook g1 = new GradeBook(oop);

		ArrayList<Student> students = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Student student = new Student(Character.toString((char) 65 + i));
			students.add(student);
			g1.addStudentToList(student);
		}

		g1.displayMessage();

		System.out.println("\nPlease, input grades for students: \n");

		for (int i = 0; i < 10; i++) {
			System.out.print("Student " + students.get(i).getName() + ": ");
			g1.setGrade(students.get(i), input.nextInt());
		}

		System.out.print(String.format("\nClass average is %.2f. ", g1.getAverageGrade()));

		Student lowestGrade = g1.getStudentWithMinGrade();
		System.out.print(String.format("Lowest grade is %d (Student %s, id: %d). ", g1.getGrade(lowestGrade),
				lowestGrade.getName(), lowestGrade.getId()));

		Student highestGrade = g1.getStudentWithMaxGrade();
		System.out.print(String.format("Highest grade is %d (Student %s, id: %d). \n", g1.getGrade(highestGrade),
				highestGrade.getName(), highestGrade.getId()));

		g1.displayBarchart();
		;

		input.close();
	}

}
