package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _6_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double salary = 0.0;

        if (km <= 5000){
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = km * 0.75 * 4 * 0.9; break;
                case "Summer":
                    salary = km * 0.90 * 4 * 0.9; break;
                case "Winter":
                    salary = km * 1.05 * 4 * 0.9; break;
            }
        }else if (km > 5000 && km <= 10000){
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = km * 0.95 * 4 * 0.9; break;
                case "Summer":
                    salary = km * 1.10 * 4 * 0.9; break;
                case "Winter":
                    salary = km * 1.25 * 4 * 0.9; break;

            }
        }else if (km > 10000){
            switch (season) {
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    salary = km * 1.45 * 4 * 0.9; break;
            }
        }
        System.out.printf("%.2f", salary);
    }
}