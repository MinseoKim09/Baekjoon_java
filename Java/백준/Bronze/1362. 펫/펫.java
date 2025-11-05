import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scenario = 1;
        while (true) {
            int o = sc.nextInt();
            int w = sc.nextInt();
            if (o == 0 && w == 0) break;
            boolean alive = true;
            while (true) {
                String action = sc.next();
                int n = sc.nextInt();
                if (action.equals("#") && n == 0) break;
                if (alive) {
                    if (action.equals("E")) {
                        w -= n;
                    } else if (action.equals("F")) {
                        w += n;
                    }
                    if (w <= 0) {
                        alive = false;
                    }
                }
            }
            String state;
            if (!alive) {
                state = "RIP";
            } else if (w > o / 2.0 && w < 2 * o) {
                state = ":-)";
            } else {
                state = ":-(";
            }
            System.out.println(scenario + " " + state);
            scenario++;
        }
        sc.close();
    }
}