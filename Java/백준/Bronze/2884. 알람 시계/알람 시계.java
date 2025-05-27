import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long m = sc.nextLong();

        if(m < 45) {
            h -= 1;
            m += 60;
        }
        m -= 45;
        if (h < 0)
            h = 23;
        System.out.println(h + " " + m);
    }
}