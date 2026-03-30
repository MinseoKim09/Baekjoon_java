import java.util.*;

public class Main {

    static final long INF = 1_000_000_001L;

    static class Recipe {
        String result;
        List<String> materials = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<String, Long> cost = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            long price = sc.nextLong();
            cost.put(name, price);
        }

        List<Recipe> recipes = new ArrayList<>();

        sc.nextLine();

        for (int i = 0; i < M; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("=");

            Recipe r = new Recipe();
            r.result = parts[0];

            String[] items = parts[1].split("\\+");

            for (String item : items) {
                int idx = 0;
                while (Character.isDigit(item.charAt(idx))) idx++;

                int num = Integer.parseInt(item.substring(0, idx));
                String name = item.substring(idx);

                r.count.add(num);
                r.materials.add(name);
            }

            recipes.add(r);
        }

        for (int iter = 0; iter < 100; iter++) {
            for (Recipe r : recipes) {

                long sum = 0;
                boolean possible = true;

                for (int i = 0; i < r.materials.size(); i++) {
                    String mat = r.materials.get(i);

                    if (!cost.containsKey(mat)) {
                        possible = false;
                        break;
                    }

                    long c = cost.get(mat);
                    sum += c * r.count.get(i);

                    if (sum >= INF) sum = INF;
                }

                if (!possible) continue;

                cost.put(r.result,
                        Math.min(cost.getOrDefault(r.result, INF), sum));
            }
        }

        if (!cost.containsKey("LOVE")) {
            System.out.println(-1);
        } else {
            long ans = cost.get("LOVE");
            if (ans >= INF) System.out.println(1000000001);
            else System.out.println(ans);
        }
    }
}