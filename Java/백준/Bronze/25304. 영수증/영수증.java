import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int s = 0;

        for(int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            s += p * c;
        }
        if (s == t)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
