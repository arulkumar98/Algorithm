package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,8,5,3,2,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr.length-row; col++) {
                if (arr[col-1] > arr[col]){
                    int temp = arr[col-1];
                    arr[col-1] = arr[col];
                    arr[col] = temp;
                }
            }
        }
    }
}
