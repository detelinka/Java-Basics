package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _3_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C =  Double.parseDouble(scanner.nextLine());

        //°F = °C × 1,8 + 32
        double F = C * 1.8 + 32;
        System.out.printf("%.2f", F);
    }
}
