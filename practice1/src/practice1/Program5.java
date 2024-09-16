package practice1;

import java.util.Scanner;

public class Program5 {

  static double balance = 100;
  static double interest = 1.08; // meaning 8 %

  public static void main( String args[] ) {

    Scanner input = new Scanner( System.in );
    System.out.print("Input number of months since initial deposit: ");
    int numberOfMonths = input.nextInt();
    
    double balanceAfterInterest = balance * Math.pow(interest, numberOfMonths); 

    System.out.print("Your balance after " + numberOfMonths + " months is ");
    System.out.println(balanceAfterInterest);

    input.close();
  }
}
