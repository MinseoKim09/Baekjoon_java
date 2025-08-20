import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = b[i] * (i + 1) - sum;
            sum += a[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}