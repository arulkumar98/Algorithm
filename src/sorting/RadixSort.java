package sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String args[]) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        int max = findMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSortForRadix(arr, exp);
        }
    }

    private static void countSortForRadix(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int n = arr.length;
        int[] count = new int[10];

        // Store the occurrences of each digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Calculate cumulative sum of count array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    private static int findMax(int[] arr) {
        return Arrays.stream(arr).max().orElse(0);
    }
}
