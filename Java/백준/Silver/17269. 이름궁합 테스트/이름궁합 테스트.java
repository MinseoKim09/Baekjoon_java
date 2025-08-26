import java.util.*;

public class Main {
    static final int[] strokes = {
        3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(N, M);
        for (int i = 0; i < minLen; i++) {
            sb.append(A.charAt(i));
            sb.append(B.charAt(i));
        }
        if (N > M) sb.append(A.substring(M));
        else if (M > N) sb.append(B.substring(N));
        int len = sb.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = strokes[sb.charAt(i) - 'A'];
        }
        while (arr.length > 2) {
            int[] next = new int[arr.length - 1];
            for (int i = 0; i < next.length; i++) {
                next[i] = (arr[i] + arr[i + 1]) % 10;
            }
            arr = next;
        }
        System.out.println((arr[0] * 10 + arr[1]) + "%");
    }
}