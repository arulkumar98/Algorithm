package bitwiseoperators;

public class FindTheNonRepectingNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,3,8,5,8,8};
        int unique = 0;
        for (int j : arr) {
            unique ^= j;
        }

         System.out.println(unique);
    }
}
