package Exam;

import java.util.Scanner;

public class _1_MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceTransition = Double.parseDouble(scanner.nextLine());
        double electricityPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());

        double sumCards = priceVideoCard * 13;
        double sumTransitions = priceTransition * 13;
        double total = sumTransitions + sumCards + 1000;
        double profitCardsPerDay = 13 * (profitPerDay - electricityPerDay);
        double returnDays  = Math.ceil(total / profitCardsPerDay);

        System.out.printf("%.0f%n%.0f", total, returnDays);
    }
}
