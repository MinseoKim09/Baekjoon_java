import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int zeroGroup = 0, oneGroup = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.charAt(i) == '0') zeroGroup++;
                else oneGroup++;
            } else {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    if (s.charAt(i) == '0') zeroGroup++;
                    else oneGroup++;
                }
            }
        }
        System.out.println(Math.min(zeroGroup, oneGroup));
    }
}