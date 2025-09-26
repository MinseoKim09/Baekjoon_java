import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = -1;
        for (int five = n / 5; five >= 0; five--) {
            int remain = n - (five * 5);
            if (remain % 2 == 0) {
                count = five + (remain / 2);
                break;
            }
        }
        System.out.println(count);
    }
}