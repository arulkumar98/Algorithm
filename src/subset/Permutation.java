package subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>sub = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        permute(arr,ans,sub,freq);
        return ans;
    }

    private void permute(int[] arr, List<List<Integer>> ans, List<Integer> subList, boolean[] freq){
        if (subList.size() == arr.length){
            ans.add(new ArrayList<>(subList));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]){
                freq[i] = true;
                subList.add(arr[i]);
                permute(arr,ans,subList,freq);
                //backTrack
                subList.removeLast();
                freq[i] = false;
            }
        }
    }

}
