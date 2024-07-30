package t;

import java.util.Scanner;

public class Aaaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }

// Вывод массива для проверки
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
