package sorting.algorithm;

public class Swap {


    public static void swap(int indexOne, int indexTwo, int[] arr){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
