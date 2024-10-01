package _3_ConditionalStatementsAdvanced.Exersises;

import java.util.Scanner;

public class _3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.0;

        switch (flower){
            case "Roses":
                totalSum = count * 5;
                if (count > 80){
                    totalSum = totalSum - (totalSum * 0.10);
                }
                break;
            case "Dahlias":
                totalSum = count * 3.80;
                if (count > 90){
                    totalSum = totalSum - (totalSum * 0.15);
                }
                break;
            case "Tulips":
                totalSum = count * 2.80;
                if (count > 80){
                    totalSum = totalSum - (totalSum * 0.15);
                }
                break;
            case "Narcissus":
                totalSum = count * 3;
                if (count < 120){
                    totalSum = totalSum + (totalSum * 0.15);
                }
                break;
            case "Gladiolus":
                totalSum = count * 2.50;
                if (count < 80){
                    totalSum = totalSum + (totalSum * 0.20);
                }
                break;
        }
        if (budget >= totalSum){
            double sumLeft = budget - totalSum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, sumLeft);
        } else {
            double sumNeeded = totalSum - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", sumNeeded);
        }
    }
}
