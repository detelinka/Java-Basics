package _4_ForLoops.LAB;

import java.util.Scanner;

public class _9_LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            left += numbers;
        }

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            right += numbers;
        }

        if (left == right){
            System.out.printf("Yes, sum = %d", left);
        } else {
            int diff = Math.abs(left - right);
            System.out.printf("No, diff = %d", diff);
        }
    }
}