package _2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //decor = 0.10 * budget
        // >150 statists -> clothing == clothing - (clothing * 0.10)

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothingPerStatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double clothing = clothingPerStatist * statists;
        double sumAll = clothing + decor;

        if (statists>=150){
            sumAll = sumAll - (clothing * 0.10);
        }

        double moneyLeft = budget - sumAll;
        double moneyNeeded = sumAll - budget;


        if (budget >= sumAll){
            System.out.printf("Action!%n" + "Wingard starts filming with %.2f leva left.", moneyLeft);
        }else {
            System.out.printf("Not enough money!%n" + "Wingard needs %.2f leva more.", moneyNeeded);

        }
    }
}
