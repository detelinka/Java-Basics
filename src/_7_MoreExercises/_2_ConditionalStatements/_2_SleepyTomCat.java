package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _2_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        int minWorkdays = (365 - days) * 63;
        int minFreeDays = days * 127;
        int minYearly = minWorkdays + minFreeDays;
        int difference = Math.abs(30000 - minYearly);
        double hour = Math.ceil(difference / 60.0) - 1;
        double min = Math.ceil(difference % 60.0);

        if (30000 > minYearly){
            System.out.printf("Tom sleeps well%n%.0f hours and %.0f minutes less for play", hour, min);
        } else {
            System.out.printf("Tom will run away%n %.0f hours and %.0f minutes more for play",hour, min);
        }

    }
}
