import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long m = sc.nextLong();
        long c = sc.nextLong();

        long total = h * 60 + m + c;
        long hour = (total / 60) % 24;
        long minute = total % 60;

        System.out.println(hour + " " + minute);
    }
}