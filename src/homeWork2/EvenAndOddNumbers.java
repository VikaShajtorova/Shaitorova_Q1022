package homeWork2;

import java.util.Random;

public class EvenAndOddNumbers {
    public void differenceBetweenSumOfEvenAndOddNumbers() {
        int[] array = {2, 4, 6, 3, 8, 1, 2, 9};

        int evenSum = 0;
        int oddSum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i += 2) {
            evenSum += array[index++];
            oddSum += array[index++];


        }

        int difference = evenSum - oddSum;
        System.out.println("The difference between the sum of even and odd numbers: " + difference);
    }

}