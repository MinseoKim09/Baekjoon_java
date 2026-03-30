import java.util.Scanner;

public class Main {

    static boolean isBlank(int x, int y) {
        while (x > 0 || y > 0) {
            if (x % 3 == 1 && y % 3 == 1) {
                return true;
            }
            x /= 3;
            y /= 3;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isBlank(i, j)) {
                    sb.append(" ");
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}