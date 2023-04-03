package homework1;

import java.util.Locale;
import java.util.Scanner;

public class EnterLetterSwitch {
    public void switchPrintVowelOrConsonantLetter() {
        Scanner scannerLetter = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String letterSwitch = scannerLetter.next().toLowerCase();
        switch (letterSwitch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "y":
                System.out.println("You have entered a vowel letter!");
                break;
            default:
                System.out.println("You have entered a consonant letter!");


        }
    }
}
