package t;

import java.util.Scanner;

public class firstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.close();

        int occupiedCells = t == 1 ? 1 : (t - 1) * 4;
        System.out.println(occupiedCells);
    }
}
