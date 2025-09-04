import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger share = n.divide(m);
        BigInteger remain = n.remainder(m);
        System.out.println(share);
        System.out.println(remain);
    }
}