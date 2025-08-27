import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int J = sc.nextInt();
        int left = 1;
        int right = M;
        int move = 0;
        for (int i = 0; i < J; i++) {
            int apple = sc.nextInt();
            if (apple < left) {
                int dist = left - apple;
                move += dist;
                left -= dist;
                right -= dist;
            } else if (apple > right) {
                int dist = apple - right;
                move += dist;
                left += dist;
                right += dist;
            }
        }
        System.out.println(move);
    }
}