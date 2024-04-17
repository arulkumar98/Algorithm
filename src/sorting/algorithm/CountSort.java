package sorting.algorithm;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1,8,7,5,6,7,2};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(int[] arr) {
        if (arr.length <= 1){
            return;
        }

        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (max < num) max = num;
        }
        int[] freq = new int[max+1];

        for (int j : arr) {
            freq[j]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (freq[i] != 0){
                arr[index] = i;
                index++;
                freq[i]--;
            }     
        }

        System.out.println(Arrays.toString(arr));
    }


}
