package homeWork1;

import java.util.Scanner;

public class EnterWord {
    public void theUserEntersTheWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String inputWord = scanner.nextLine().toLowerCase();
        while (true) {
            if (inputWord.equals("exit")) {
                System.out.println("The program is completed");
                break;
            } else {
                System.out.println("Вы ввели " + inputWord);
            }
        }
    }
}

