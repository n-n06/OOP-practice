package lab1;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class Analyzer {

	public static void main(String[] args) {
		Data d = new Data();
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("Enter number (Q to quit): ");
			String input = in.next();

			if (input.equals("Q")) {
				System.out.println("Average = " + d.getAverage());
				System.out.println("Maximum = " + d.getMax());
				break;
			} else {
				try {
					int value = Integer.parseInt(input);
					d.add(value);
				} catch (NumberFormatException e) {
					System.err.println("Please, only enter valid numbers of Q to quit!");
				}
			}
		}

		in.close();
	}

}
