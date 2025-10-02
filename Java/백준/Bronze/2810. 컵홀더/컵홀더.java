import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();
        seats = seats.replace("LL", "L");
        int holders = seats.length() + 1;
        System.out.println(Math.min(N, holders));
        sc.close();
    }
}