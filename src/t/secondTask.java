package t;

public class secondTask {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[][] grid = new int[m][n];
        int number = 1;

        for (int sum = 0; sum <= n + m - 2; sum++) {
            for (int i = 0; i <= sum; i++) {
                int j = sum - i;
                if (i < m && j < n) {
                    grid[i][j] = number++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
