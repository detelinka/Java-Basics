package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _1_TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double s = (b1 + b2) * h / 2;

        System.out.printf("%.2f", s);
    }

}
