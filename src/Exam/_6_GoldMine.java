package Exam;

import java.util.Scanner;

public class _6_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locations; i++) {
            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double totalGold = 0;

            for (int j = 0; j < days; j++) {
                double dailyGold = Double.parseDouble(scanner.nextLine());
                totalGold += dailyGold;
            }

            double averageGoldPerDay = totalGold / days;

            if (averageGoldPerDay < expectedGoldPerDay) {
                double neededGold = Math.abs(averageGoldPerDay - expectedGoldPerDay);
                System.out.printf("You need %.2f gold.%n", neededGold);
            } else {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            }
        }
    }
}