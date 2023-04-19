package homeWork3;

import java.util.Arrays;
import java.util.Random;

public class CreateClassArray {

    private int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public void printSortArray(int[] arr) {
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    private int findTheMaxValue(int[] arr) {
        sortArray(arr);
        return arr[arr.length - 1];
    }

    public void printMaxValue(int[] arr) {
        System.out.println(findTheMaxValue(arr));

    }

    private int findElementByIndex(int[] arr, int index) {
        int element = 0;
        for (int i = 0; i < index + 1; i++) {
            element = arr[index];
        }
        return element;
    }

    public void printElement(int[] arr, int index) {
        System.out.println(findElementByIndex(arr, index));
    }
}
