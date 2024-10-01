package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _2_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String race = scanner.nextLine();
        int all = juniors + seniors;

        double tax = 0.0;

        switch (race) {
            case "trail":  tax = ((5.50 * juniors) + (7.0 * seniors)) * 0.95; break;
            case "cross-country": tax = ((8.0 * juniors) + (9.5 * seniors)) * 0.95;
                if (all >= 50) {
                    tax *= 0.75;
                }
            break;
            case "downhill": tax = ((12.25 * juniors) + (13.75 * seniors)) * 0.95; break;
            case "road": tax = ((20.0 * juniors) + (21.5 * seniors)) * 0.95; break;

        }
        System.out.printf("%.2f", tax);
    }
}