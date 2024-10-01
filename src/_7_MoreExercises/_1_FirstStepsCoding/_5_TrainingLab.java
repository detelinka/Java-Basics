package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _5_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine()); // дължина в метри
        double h = Double.parseDouble(scanner.nextLine()); // широчина в метри
        // 3 <= h <= w <= 100
        // 1 работно място е 70см * 120см = 8400см
        // катедра = 2 работи места
        // входна врата = 1 работно място

        double w_cm = w * 100; // дължина в сантиметри
        double h_cm = h * 100; // широчина в сантиметри

        double a = Math.floor((h_cm - 100) / 70);
        double b = Math.floor(w_cm / 120);

        double seats = Math.abs(a * b) - 3;

        System.out.printf("%.0f", seats);
    }
}