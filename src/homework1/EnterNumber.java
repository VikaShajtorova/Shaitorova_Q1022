package homework1;

import java.util.Scanner;

public class EnterNumber {
    public void findTheSumOfTheNumbersBetweenTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber >= secondNumber) {
            System.out.println("Error: первое число не может быть меньше или равно второму");
        } else {
            int sum = 0;
            for (int x = firstNumber; x <= secondNumber; x++) {
                if (x % 3 == 0) {
                    sum += x;
                }
            }
            System.out.println("Сумма всех чисел которые делятся на 3 и расположены между "
                    + firstNumber + " и " + secondNumber + " равна: " + sum);

        }
    }
}