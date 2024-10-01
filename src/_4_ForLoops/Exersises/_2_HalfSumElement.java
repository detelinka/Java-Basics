package _4_ForLoops.Exersises;

import java.util.Scanner;

public class _2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // брой на въведени числа от конзолата
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max){
                max = number;
            }
        }
            int sumWithoutMax = sum - max;
            if (max == sumWithoutMax){
                System.out.printf("Yes%nSum = %d", max);
            } else {
                int diff = Math.abs(max - sumWithoutMax);
                System.out.printf("No%nDiff = %d", diff);
            }
    }
}