package _8_ExamPreparation;

import java.util.Scanner;

public class _3_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());

        double total = 0;

        switch (season){
            case "Summer":
                switch (destination){
                    case "Dubai": total = countDays * 40000 * 0.7; break;
                    case "Sofia": total = countDays * 12500 * 1.25; break;
                    case "London": total = countDays * 20250; break;
                } break;
            case "Winter":
                switch (destination){
                    case "Dubai": total = countDays * 45000 * 0.7; break;
                    case "Sofia": total = countDays * 17000 * 1.25; break;
                    case "London": total = countDays * 24000; break;
                }
        }
        if (budget >= total){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - total);
        }else {
            System.out.printf("The director needs %.2f leva more!", total - budget);
        }
    }
}