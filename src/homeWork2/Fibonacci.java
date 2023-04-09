package homeWork2;

public class Fibonacci {
    public void fillTheArrayWithFibonacciNumbers(int arrLenght){
        int [] arr = new int[arrLenght];
        arr [1] = 1;
        for (int i = 2; i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i] + " ");
        }
    }
}
