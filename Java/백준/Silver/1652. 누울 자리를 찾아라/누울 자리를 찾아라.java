import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        char[][] room = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < N; j++) {
                room[i][j] = line.charAt(j);
            }
        }
        int rowCount = 0;
        int colCount = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {
                    cnt++;
                } else {
                    if (cnt >= 2) rowCount++;
                    cnt = 0;
                }
            }
            if (cnt >= 2) rowCount++;
        }
        for (int j = 0; j < N; j++) {
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (room[i][j] == '.') {
                    cnt++;
                } else {
                    if (cnt >= 2) colCount++;
                    cnt = 0;
                }
            }
            if (cnt >= 2) colCount++;
        }
        System.out.println(rowCount + " " + colCount);
    }
}