import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int leftGap = B - A;
            int rightGap = C - B;
            System.out.println(Math.max(leftGap, rightGap) - 1);
        }
        sc.close();
    }
}