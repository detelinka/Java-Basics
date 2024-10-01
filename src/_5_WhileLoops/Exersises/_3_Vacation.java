package _5_WhileLoops.Exersises;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyForExcursion = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int counterSpendMoney = 0;
        int counterDays = 1;

        while (currentMoney<moneyForExcursion) {
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (input.equals("spend")) {
                currentMoney = currentMoney - money;
                if (currentMoney <= 0) {
                    currentMoney = 0;
                }
                counterSpendMoney++;
                if (counterSpendMoney == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(counterDays);
                    break;
                }
            } else if (input.equals("save")) {
                currentMoney += money;
                counterSpendMoney = 0;
                if (currentMoney >= moneyForExcursion) {
                    System.out.printf("You saved the money for %d days.", counterDays);
                    break;
                }
            }
            counterDays++;
        }
    }
}