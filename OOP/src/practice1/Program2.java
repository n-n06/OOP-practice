package practice1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double squareSide;

		System.out.println("Enter the length of a side of a square: ");
		squareSide = input.nextInt();

		double squareArea = squareSide * squareSide;
		System.out.println("Area: " + squareArea);

		double squarePerimeter = squareSide * 4;
		System.out.println("Perimeter: " + squarePerimeter);

		double squareDiagonal = Math.sqrt(2.0) * squareSide;
		System.out.println("Diagonal: " + squareDiagonal);

		input.close();
	}
}
