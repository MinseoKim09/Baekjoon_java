import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.close();
        int A = 300;
        int B = 60;
        int C = 10;
        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            int a = T / A;
            T %= A;
            int b = T / B;
            T %= B;
            int c = T / C;
            T %= C;
            System.out.println(a + " " + b + " " + c);
        }
    }
}