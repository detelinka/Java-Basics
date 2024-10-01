package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _1_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketsPriceNormal = people * 249.99;
        double ticketsPriceVIP = people * 499.99;
        double money = 0.0;

         switch (category){
             case "VIP":
                 if (people >= 1 && people <= 4){
                     money = ticketsPriceVIP + (budget * 0.75);
                 } else if (people >= 5 && people <= 9){
                     money = ticketsPriceVIP + (budget * 0.60);
                 } else if (people >= 10 && people <= 24) {
                     money = ticketsPriceVIP + (budget * 0.50);
                 } else if (people >= 25 && people <= 49) {
                     money = ticketsPriceVIP + (budget * 0.40);
                 } else if (people >= 50) {
                     money = ticketsPriceVIP + (budget * 0.25);
                 }
                 if (budget < money){
                     double moneyNeeded = money - budget;
                     System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                 } else {
                     double moneyLeft = budget - money;
                     System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                 }
                 break;
             case "Normal":
                 if (people >= 1 && people <= 4){
                     money = ticketsPriceNormal + (budget * 0.75);
                 } else if (people >= 5 && people <= 9){
                     money = ticketsPriceNormal + (budget * 0.60);
                 } else if (people >= 10 && people <= 24) {
                     money = ticketsPriceNormal + (budget * 0.50);
                 } else if (people >= 25 && people <= 49) {
                     money = ticketsPriceNormal + (budget * 0.40);
                 } else if (people >= 50) {
                     money = ticketsPriceNormal + (budget * 0.25);
                 }

                 if (budget < money){
                     double moneyNeeded = money - budget;
                     System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                 } else {
                     double moneyLeft = budget - money;
                     System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                 }
                 break;
         }
    }
}