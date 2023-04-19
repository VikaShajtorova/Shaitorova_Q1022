package homeWork1;

import java.util.Scanner;

public class EnterLetterIf {
    public void printVowelOrConsonantLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String letter = scanner.nextLine().toLowerCase();
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                letter.equals("o") || letter.equals("u") || letter.equals("y")) {
            System.out.println("You have entered a vowel letter");
        } else {
            System.out.println("You have entered a consonant letter");
        }


    }

}
