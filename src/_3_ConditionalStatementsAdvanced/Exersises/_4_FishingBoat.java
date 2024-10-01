package _3_ConditionalStatementsAdvanced.Exersises;

import java.util.Scanner;

public class _4_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double springPrice = 3000;
        double summerPrice = 4200;
        double autumnPrice = 4200;
        double winterPrice = 2600;

        double totalPrice = 0;

        switch (season){
            case "Spring":
                if (fisherman <= 6){
                    totalPrice = springPrice - (springPrice * 0.10);
                } else if (fisherman <= 11) {
                    totalPrice = springPrice - (springPrice * 0.15);
                } else if (fisherman > 12) {
                    totalPrice = springPrice - (springPrice * 0.25);
                }
                if (fisherman % 2 == 0) {
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;
            case "Summer":
                if (fisherman <= 6){
                    totalPrice = summerPrice - (summerPrice * 0.10);
                } else if (fisherman <= 11) {
                    totalPrice = summerPrice - (summerPrice * 0.15);
                } else if (fisherman > 12) {
                    totalPrice = summerPrice - (summerPrice * 0.25);
                }
                if (fisherman % 2 == 0) {
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;
            case "Autumn":
                if (fisherman <= 6){
                    totalPrice = autumnPrice - (autumnPrice * 0.10);
                } else if (fisherman <= 11) {
                    totalPrice = autumnPrice - (autumnPrice * 0.15);
                } else if (fisherman > 12) {
                    totalPrice = autumnPrice - (autumnPrice * 0.25);
                }
                break;
            case "Winter":
                if (fisherman <= 6){
                    totalPrice = winterPrice - (winterPrice * 0.10);
                } else if (fisherman <= 11) {
                    totalPrice = winterPrice - (winterPrice * 0.15);
                } else if (fisherman > 12) {
                    totalPrice = winterPrice - (winterPrice * 0.25);
                }
                if (fisherman % 2 == 0) {
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;
        }if (budget >= totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double moneyNeeded = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);

        }
    }
}