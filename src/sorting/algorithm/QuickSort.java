package sorting.algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,8,7,5,6,7,2};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end){
            return;  // base case;
        }

        int left = start;
        int right = end;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while (left <= right){

            while (arr[left] < pivot){
                left++;
            }
            while (arr[right] > pivot){
                right--;
            }

            // validation found
            if (left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            //recursion call
            quickSort(arr, start, right);
            quickSort(arr, left, end);
        }
    }














}
