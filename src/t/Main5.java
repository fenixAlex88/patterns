package t;


import java.util.*;

public class Main5 {
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
        for (int i = 0; i < n; i++) {
            if (depCount[i] == 0) {
                withoutDep.add(i);
            }
        }

        List<List<Integer>> levels = new ArrayList<>();
        while (!withoutDep.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = withoutDep.size();
            for (int i = 0; i < size; i++) {
                Integer current = withoutDep.poll();
                if (current != null) {
                    level.add(current + 1);
                    for (int next : dependencies.get(current)) {
                        depCount[next]--;
                        if (depCount[next] == 0) {
                            withoutDep.add(next);
                        }
                    }
                }
            }
            Collections.sort(level);
            levels.add(level);
        }

        System.out.println(levels.size());
        for (List<Integer> level : levels) {
            System.out.print(level.size() + " ");
            for (int i = 0; i < level.size(); i++) {
                if (i != level.size() - 1)
                    System.out.print(level.get(i) + " ");
                else
                    System.out.print(level.get(i));
            }
            System.out.println();
        }
    }
}
