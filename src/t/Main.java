package t;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> dependencies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dependencies.add(new ArrayList<>());
        }

        int[] depCount = new int[n];
        for (int i = 0; i < n; i++) {
            depCount[i] = sc.nextInt();
            for (int j = 0; j < depCount[i]; j++) {
                int dep = sc.nextInt() - 1;
                dependencies.get(dep).add(i);
            }
        }
        sc.close();

        Queue<Integer> withoutDep = new LinkedList<>();
        int maxTime = 0;

        for (int i = 0; i < n; i++) {
            if (depCount[i] == 0) {
                withoutDep.add(i);
            }
        }

        while (!withoutDep.isEmpty()) {
            int size = withoutDep.size();
            maxTime++;
            for (int i = 0; i < size; i++) {
                Integer current = withoutDep.poll();
                if (current != null) {
                    for (int next : dependencies.get(current)) {
                        depCount[next]--;
                        if (depCount[next] == 0) {
                            withoutDep.add(next);
                        }
                    }
                }
            }
        }

        System.out.println(maxTime);
    }
}
