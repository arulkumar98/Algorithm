package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] num = {1,6,7,3,5,0,3};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void sort(int[] num) {
        for (int i = 0; i <num.length-1 ; i++) {
            for (int j = i; j >= 0 ; j--) {
                if (num[j+1] < num[j]){
                    int temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                }else break;
            }
        }
    }
}
