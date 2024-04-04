package bitwiseoperators;

public class SetBit {
    public static void main(String[] args) {
        int count = 0;
        int n = 66;
//        while (n > 0){
//            count++;
//            n = n- (n & n-1);
//        }

        while (n > 0){
            count++;
            n = n & (n-1);
        }

        System.out.println(count);
    }
}
