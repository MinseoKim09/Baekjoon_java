import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        sc.close();
        N = (N / 100) * 100;
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((N + i) % F == 0) {
                result = i;
                break;
            }
        }
        System.out.printf("%02d\n", result);
    }
}