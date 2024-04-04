package bitwiseoperators;

public class SignBitChecker {
    public static void main(String[] args) {
        int num = -10; // Example number

        // Check the sign bit
        if ((num & (1 << 31)) == 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}
