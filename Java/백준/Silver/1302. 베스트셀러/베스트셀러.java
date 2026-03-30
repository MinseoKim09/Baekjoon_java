import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String title = sc.nextLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        String answer = "";
        int max = 0;

        for (String key : map.keySet()) {
            int count = map.get(key);

            if (count > max) {
                max = count;
                answer = key;
            } else if (count == max) {
                if (key.compareTo(answer) < 0) {
                    answer = key;
                }
            }
        }

        System.out.println(answer);
    }
}