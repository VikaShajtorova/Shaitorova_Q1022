package homeWork2;

import java.util.Random;

public class SumMinMax {
    public void findSumMinAndMaxElementsInArray() {
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
            System.out.print(array[i] + " ");
        }

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println();
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        int sum = min + max;
        System.out.println();
        System.out.println("Sum min and max element: " + sum);


    }
}