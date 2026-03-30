import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vote = new int[n];

        for (int i = 0; i < n; i++) {
            vote[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(0);
            return;
        }

        int count = 0;

        while (true) {
            int maxIdx = 1;

            for (int i = 1; i < n; i++) {
                if (vote[i] > vote[maxIdx]) {
                    maxIdx = i;
                }
            }

            if (vote[0] > vote[maxIdx]) {
                break;
            }

            vote[maxIdx]--;
            vote[0]++;
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
