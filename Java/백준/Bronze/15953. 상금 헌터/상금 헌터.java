import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] rank1 = {1, 2, 3, 4, 5, 6};
        int[] prize1 = {500, 300, 200, 50, 30, 10};
        int[] rank2 = {1, 2, 4, 8, 16};
        int[] prize2 = {512, 256, 128, 64, 32};
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int total = 0;
            if (a > 0) {
                int pos = 0;
                for (int i = 0; i < rank1.length; i++) {
                    pos += rank1[i];
                    if (a <= pos) {
                        total += prize1[i];
                        break;
                    }
                }
            }
            if (b > 0) {
                int pos = 0;
                for (int i = 0; i < rank2.length; i++) {
                    pos += rank2[i];
                    if (b <= pos) {
                        total += prize2[i];
                        break;
                    }
                }
            }
            sb.append(total * 10000).append("\n");
        }
        System.out.print(sb);
    }
}