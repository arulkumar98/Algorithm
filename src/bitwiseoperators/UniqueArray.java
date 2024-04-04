package bitwiseoperators;

public class UniqueArray {
    public static int findUniqueNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4 , 4, 3, 2};
        int uniqueNumber = findUniqueNumber(nums);
        System.out.println("The unique number is: " + uniqueNumber);
    }
}
