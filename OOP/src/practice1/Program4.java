package practice1;

import practice1.utils.*;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input a: ");
		double a = input.nextDouble();

		System.out.print("Input b: ");
		double b = input.nextDouble();

		System.out.print("Input c: ");
		double c = input.nextDouble();

		try {
			double D = discriminant(a, b, c);
			double[] roots = calculateRoots(a, b, D);

			for (int i = 0; i < roots.length; i++) {
				System.out.print(roots[i] + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		input.close();
	}

	private static double discriminant(double a, double b, double c) throws NegativeDiscriminant {

		double D = b * b - (4 * a * c);
		if (D < 0) {
			throw new NegativeDiscriminant("The value of discriminant is less than 0");
		}
		return D;

	}

	private static double[] calculateRoots(double a, double b, double D) {

		double root1 = (-b + Math.sqrt(D)) / (2 * a);
		double root2 = (-b - Math.sqrt(D)) / (2 * a);

		return new double[] { root1, root2 };
	}
}
