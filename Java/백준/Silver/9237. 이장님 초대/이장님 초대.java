import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(trees);
        int maxDay = 0;
        for (int i = 0; i < N; i++) {
            int growFinish = trees[N - 1 - i] + (i + 1);
            maxDay = Math.max(maxDay, growFinish);
        }
        System.out.println(maxDay + 1);
    }
}