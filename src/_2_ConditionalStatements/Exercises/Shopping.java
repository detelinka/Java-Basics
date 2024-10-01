package _2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        //ако видеокартите са повече от процесорите -> 15% отстъпка от крайната цена
        // видеокарта - 250лв за бр
        // Процесор – 35% от цената на закупените видеокарти/бр.
        //Рам памет – 10% от цената на закупените видеокарти/бр.

        double videoCardsPrice = videoCards * 250;
        double processorsPrice = (videoCardsPrice * 0.35) * processors;
        double RAMPrice = (videoCardsPrice * 0.10) * RAM;
        double total = videoCardsPrice + processorsPrice + RAMPrice;

        if (videoCards > processors){
            total = total - (total * 0.15);
        }
        if (budget >= total){
            double moneyLeft = budget - total;
            System.out.printf("You have %.2f leva left!", moneyLeft);
        }else {
            double moneyNeeded = total - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeeded);
        }
    }
}

//Ако бюджета е достатъчен: "You have {остатъчен бюджет} leva left!"
//Ако сумата надхвърля бюджета: "Not enough money! You need {нужна сума} leva more!"
//Резултатът да се форматира до втория знак след десетичната запетая.
