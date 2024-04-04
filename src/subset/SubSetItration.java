package subset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubSetItration {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> mainList = new ArrayList<>();
        HashSet<List<Integer>> setList = new HashSet<>();
        mainList.add(new ArrayList<>());

        for (int num : arr){
            int n = mainList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> subList = new ArrayList<>(mainList.get(i));
                subList.add(num);
                if (setList.contains(subList)){
                    continue;
                }
                setList.add(subList);
                mainList.add(subList);
            }
        }
        return mainList;
    }
}
