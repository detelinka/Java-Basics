package _4_ForLoops.LAB;

import java.util.Scanner;

public class _10_EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){even += num;}
            else {odd += num;}
        }
        if (even == odd){
            System.out.printf("Yes%nSum = %d", even);
        } else {
            int diff = Math.abs(even - odd);
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
