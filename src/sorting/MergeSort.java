 package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = {5,4,3,2,1};
        int[] ans =  mergeSort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(ans));

    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length /2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeSort(left,right);
    }

    private static int[] mergeSort(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                 j++;
            }
            k++;
        }

        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            ans[k] = first[j];
            j++;
            k++;
        }

        return ans;
    }

    public static void inPlaceMergeSort(int[] arr, int start, int end){
        if (end - start == 1){
            return ;
        }

        int mid = start +(end - start) /2;

        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid, end);

        inPlaceMergeSort(arr, start, mid,end);
    }

    private static void inPlaceMergeSort(int[] arr, int start, int mid, int end) {

        int[] mix  = new int[end-start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;

            }
            k++;
        }

        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end){
            mix[k] = arr[i];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = arr[l];
        }
    }

}
