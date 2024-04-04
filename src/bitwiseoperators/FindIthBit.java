package bitwiseoperators;

import java.util.Scanner;

public class FindIthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the num");
        int num = scanner.nextInt();
        System.out.println("Entre the bit count");
        int n = scanner.nextInt()-1;
        int mask = 1 << n;
        int ans = (num & mask) >> n;
        System.out.println(mask);
        System.out.println(ans);
    }
}
