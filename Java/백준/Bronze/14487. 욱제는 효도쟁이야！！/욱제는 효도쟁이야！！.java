import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        int sum = 0;
        int maxCost = 0;
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
            sum += cost[i];
            if (cost[i] > maxCost) {
                maxCost = cost[i];
            }
        }
        System.out.println(sum - maxCost);
    }
}