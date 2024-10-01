package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _3_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine()); //лозе в кв.м
        double y = Double.parseDouble(scanner.nextLine()); //гроздеза един кв.м
        double z = Double.parseDouble(scanner.nextLine()); //нужни литри вино
        int workers = Integer.parseInt(scanner.nextLine()); //брой работници

        double wine = 0.40 * (x * y) / 2.5;

        if (wine >= z) {
            double wineMade = Math.floor(wine -z);
            double winePerWorker = Math.ceil(wineMade / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", wine, wineMade, winePerWorker );
        } else {
            double wineNeeded = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", wineNeeded);
        }



    }
}
