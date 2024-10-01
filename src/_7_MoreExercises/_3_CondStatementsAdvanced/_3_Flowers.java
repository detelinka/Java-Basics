package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _3_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine()); // брой хризантеми
        int roses = Integer.parseInt(scanner.nextLine()); // брой рози
        int tulips = Integer.parseInt(scanner.nextLine()); // брой лалета
        String season = scanner.nextLine(); // Spring, Summer, Autumn, Winter
        String holiday = scanner.nextLine(); // Y или N

        double allFLowers = chrysanthemums + roses + tulips;
        double totalSpringSummer = (chrysanthemums * 2.00) + (roses * 4.10) + (tulips * 2.50);
        double totalAutumnWinter = (chrysanthemums * 3.75) + (roses * 4.50) + (tulips * 4.15);

        if (allFLowers > 20) {
            totalSpringSummer = totalSpringSummer - (totalSpringSummer * 0.20);
            totalAutumnWinter = totalAutumnWinter - (totalAutumnWinter * 0.20);
            switch (holiday){
                case "Y":
                    totalSpringSummer = totalSpringSummer + (totalSpringSummer * 0.15);
                    totalAutumnWinter = totalAutumnWinter + (totalAutumnWinter * 0.15);
                    break;
                case "N":
                    break;
            }
        } else {
            switch (holiday){
                case "Y":
                    totalSpringSummer = totalSpringSummer + (totalSpringSummer * 0.15);
                    totalAutumnWinter = totalAutumnWinter + (totalAutumnWinter * 0.15);
                    break;
                case "N":
                    break;
            }
        }
        switch (season){
            case "Spring":
                if (tulips > 7){
                    totalSpringSummer = totalSpringSummer - (totalSpringSummer * 0.05);
                }
                totalSpringSummer = totalSpringSummer + 2;
                System.out.printf("%.2f",totalSpringSummer);
                break;

            case "Summer":
                totalSpringSummer = totalSpringSummer + 2;
                System.out.printf("%.2f",totalSpringSummer);
                break;

            case "Autumn":
                totalAutumnWinter = totalAutumnWinter + 2;
                System.out.printf("%.2f",totalAutumnWinter);
                break;

            case "Winter":
                if (roses >= 10){
                    totalAutumnWinter = totalAutumnWinter - (totalAutumnWinter * 0.10);
                }
                totalAutumnWinter = totalAutumnWinter + 2;
                System.out.printf("%.2f",totalAutumnWinter);
                break;
        }
    }
}