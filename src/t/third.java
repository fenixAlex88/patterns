package t;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        int[] rowSums = new int[n];
        int[] colSums = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSums[i] += matrix[i][j];
                colSums[j] += matrix[i][j];
            }
        }
        int interestingPairsCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int diff = Math.abs(rowSums[i] - colSums[j]);
                if (diff <= matrix[i][j]) {
                    interestingPairsCount++;
                }
            }
        }
        System.out.println(interestingPairsCount);

    }
}
