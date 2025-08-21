import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int totalScore = 0;
        int bonus = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'O') {
                totalScore += (i + 1) + bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }
        System.out.println(totalScore);
    }
}