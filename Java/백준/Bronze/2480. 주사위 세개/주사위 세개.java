import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prize;

        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {
            prize = 1000 + a * 100;
        } else if (b == c) {
            prize = 1000 + b * 100;
        } else {
            int max = Math.max(a, Math.max(b, c));
            prize = max * 100;
        }
        System.out.println(prize);
    }
}