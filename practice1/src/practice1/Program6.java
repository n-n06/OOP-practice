package practice1;

import java.util.Scanner;

public class Program6 {
  public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    
    System.out.println("Input a word or a sentence: ");
    String word = input.nextLine();

    System.out.println(isPalindrom(word));

    input.close();
  }

  private static boolean isPalindrom(String word) {
    word = word.replace(" ", "").toLowerCase();
    int wordLenght = word.length();


    for (int i = 0; i < wordLenght; i++) {
      if (word.charAt(i) != word.charAt(wordLenght - 1 - i)) {
        return false;
      }
    }

    return true;
  } 
}
