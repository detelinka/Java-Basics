package _4_ForLoops.Exersises;

import java.util.Scanner;

public class _3_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // count - броячи
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200){
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        double percentP1 = (p1 * 1.0) / n * 100;
        double percentP2 = (p2 * 1.0) / n * 100;
        double percentP3 = (p3 * 1.0) / n * 100;
        double percentP4 = (p4 * 1.0) / n * 100;
        double percentP5 = (p5 * 1.0) / n * 100;

        System.out.printf("%.2f%%%n", percentP1);
        System.out.printf("%.2f%%%n", percentP2);
        System.out.printf("%.2f%%%n", percentP3);
        System.out.printf("%.2f%%%n", percentP4);
        System.out.printf("%.2f%%%n", percentP5);
    }
}
