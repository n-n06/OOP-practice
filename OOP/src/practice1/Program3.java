package practice1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your numeric grade: ");
		int numericGrade = input.nextInt();
		String letterGrade;

		if (numericGrade >= 95) {
			letterGrade = "A";
		} else if (numericGrade >= 90) {
			letterGrade = "A-";
		} else if (numericGrade >= 85) {
			letterGrade = "B+";
		} else if (numericGrade >= 80) {
			letterGrade = "B";
		} else if (numericGrade >= 75) {
			letterGrade = "B-";
		} else if (numericGrade >= 70) {
			letterGrade = "C+";
		} else if (numericGrade >= 65) {
			letterGrade = "C";
		} else if (numericGrade >= 60) {
			letterGrade = "C-";
		} else if (numericGrade >= 55) {
			letterGrade = "D+";
		} else if (numericGrade >= 50) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}

		System.out.println("Your grade is " + letterGrade);

		input.close();
	}
}
