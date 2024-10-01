package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _8_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double s = Math.PI * Math.pow( r, 2);
        double p = Math.PI * 2 * r;

        System.out.printf("%.2f %n%.2f", s, p);
    }
}
