import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] stores = new int[N];
        for (int i = 0; i < N; i++) {
            stores[i] = sc.nextInt();
        }
        int cur = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (stores[i] == cur) {
                count++;
                cur = (cur + 1) % 3;
            }
        }
        System.out.println(count);
    }
}