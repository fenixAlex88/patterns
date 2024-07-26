package t;

public class fifthTask {
    static class Edge {
        int u, v, height;

        Edge(int u, int v, int height) {
            this.u = u;
            this.v = v;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        Edge[] edges = new Edge[]{
                new Edge(1, 2, 100),
                new Edge(1, 3, 400),
                new Edge(2, 3, 300),
                new Edge(2, 4, 200),
                new Edge(3, 4, 500),
        };

        int minHeight = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                if (edges[j].u == i+1 || edges[j].v == i+1)
                    max = Math.max(max, edges[j].height);
            }
            minHeight = Math.min(minHeight, max);
        }
        System.out.println(minHeight);
        System.out.println(Integer.parseInt("-1"));
    }
}
