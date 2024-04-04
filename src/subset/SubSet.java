package subset;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(subsets(num));

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        int index = 0;
        subsets(ans,index,subList,nums);
        return ans;
    }

     private static void subsets(List<List<Integer>> ans, int index,List<Integer>subList,int[] arr) {
        if (index >= arr.length){
            ans.add(subList);
            return;
        }
        int num = arr[index];
        subList.add(num);
        subsets(ans,index+1,new ArrayList<>(subList),arr);

        subList.removeLast();
        subsets(ans,index+1,new ArrayList<>(subList),arr);
    }
}
