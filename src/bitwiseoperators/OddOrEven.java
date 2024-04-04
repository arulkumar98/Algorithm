package bitwiseoperators;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n & 1) == 0) {
            System.out.println(n + " It's even Number");
        } else System.out.println(n + " It's odd Number");
    }
}
