package bitwiseoperators;

import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        System.out.println("Enter the bit position (0-based indexing):");
        int i = scanner.nextInt();

        // Create a mask with the ith bit set to 1
        int mask = 1 << i;

        // Perform bitwise OR with the mask to set the ith bit
        int result = num | mask;

        System.out.println("After setting the " + i + "th bit, the number is: " + result);
    }
}
