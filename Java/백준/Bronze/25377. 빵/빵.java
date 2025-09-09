import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = -1;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A <= B) {
                if (answer == -1 || B < answer) {
                    answer = B;
                }
            }
        }
        System.out.println(answer);
    }
}