package _4_ForLoops.LAB;

import java.util.Scanner;

public class _2_NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i -= 1){
            System.out.println(i);
        }
    }
}