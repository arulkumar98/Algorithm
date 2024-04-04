package subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetDuplicate {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outerList.size() - 1;
            int n = outerList.size();
            for (int j = start; j < n; j++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(j));
                internalList.add(arr[i]);
                outerList.add(internalList);
            }
        }
        return outerList;
    }
}
