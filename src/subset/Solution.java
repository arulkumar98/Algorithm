package subset;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));

    }
   public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, 0, result);
        return result;
    }

    private static void permuteHelper(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            permuteHelper(nums, index + 1, result);
            swap(nums, index, i); // backtrack to restore the original order
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}