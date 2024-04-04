package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {3,0,1};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void sort(int[] num) {
        int n = num.length;
        for (int i = 0; i < num.length ; i++) {
            //find the largest num
            int max = 0;
            for (int j = 1; j < n-i; j++) {
                if (num[j] > num[max]){
                    max = j;
                }
            }

            int temp = num[n-1-i];
            num[n-1-i] = num[max];
            num[max] = temp;

        }
    }
}
