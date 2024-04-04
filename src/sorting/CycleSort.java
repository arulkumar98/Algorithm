package sorting;

import java.util.Arrays;



public class CycleSort {
    public static void main(String[] args) {
        int[] num = {5,4,3,2,1};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // Correct position (adjust for 0-based indexing)
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
