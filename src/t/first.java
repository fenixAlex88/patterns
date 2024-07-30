package t;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int k = n - 100 + 1;
        long sum = k * (100L + n) / 2;
        System.out.println(sum);
    }
}
