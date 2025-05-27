import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long sum = 0;

        for(int i = 1; i <= 9; i++) {
            sum = num * i;
            System.out.println(num + " * " + i + " = " + sum);
        }
    }
}