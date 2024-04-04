package subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetDuplicateREC {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr); // Sort the array to handle duplicates properly
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        int index = 0;
        subsets(ans, index, subList, arr);
        return ans;
    }

    private void subsets(List<List<Integer>> ans, int index, List<Integer> subList, int[] arr) {
        ans.add(new ArrayList<>(subList)); // Add the current subset
        for (int i = index; i < arr.length; i++) {
            // Skip duplicates to avoid duplicate subsets
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            subList.add(arr[i]);
            subsets(ans, i + 1, new ArrayList<>(subList), arr); // Recursive call with the next index
            subList.removeLast();
        }
    }
}


