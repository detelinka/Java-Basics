package _6_NestedLoops.LAB;

import java.util.Scanner;

public class _4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startN = Integer.parseInt(scanner.nextLine());
        int endN = Integer.parseInt(scanner.nextLine());
        int magicN = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        int n1 = 0;
        int n2 = 0;
        boolean flag = false;
        for (int x1 = startN; x1 <= endN; x1++) {
            for (int x2 = startN; x2 <= endN; x2++) {
                combinations++;
                if (x1 + x2 == magicN){
                    n1 = x1;
                    n2 = x2;
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        if (flag){
            System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, n1, n2, magicN);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinations, magicN);
        }
    }
}