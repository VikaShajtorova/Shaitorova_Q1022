package homeWork1;

import java.util.Scanner;

public class Enter {
    public void exit() {
        Scanner scanner = new Scanner(System.in);
        String newWord = scanner.nextLine().toLowerCase();
        do {
            System.out.print("Введите слово: ");
        }
        while (newWord.equals("exit"));
            System.out.println("Вы ввели:" + newWord);
    }
}



