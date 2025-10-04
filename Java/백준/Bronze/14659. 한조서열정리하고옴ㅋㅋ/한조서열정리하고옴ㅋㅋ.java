import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }
        int maxKill = 0;
        int count = 0;
        int highest = heights[0];
        for (int i = 1; i < N; i++) {
            if (heights[i] < highest) {
                count++;
                maxKill = Math.max(maxKill, count);
            } else {
                highest = heights[i];
                count = 0;
            }
        }
        System.out.println(maxKill);
    }
}