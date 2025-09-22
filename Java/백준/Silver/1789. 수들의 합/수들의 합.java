import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long sum = 0;
        long N = 0;
        while (sum + (N + 1) <= S) {
            N++;
            sum += N;
        }
        System.out.println(N);
    }
}