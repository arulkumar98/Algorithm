package recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static void main(String[] args) {
        String str = "23";
    }
    public static List<String> letterCombinations(String digits) {
      List<String> ans = new ArrayList<>();
      if (digits.isEmpty()){
          return ans;
      }
      String[] mappings = {"0","1","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      helper(digits,0,new StringBuilder(),ans,mappings);
      return ans;
    }

    private static void helper(String digits, int index, StringBuilder sb, List<String> ans, String[] mappings) {
        if (index == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String letters = mappings[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            helper(digits, index+1, sb, ans, mappings);
            //backtracking
            sb.deleteCharAt(sb.length()-1); // delete last;
        }
    }
}
