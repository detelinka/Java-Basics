package _4_ForLoops.Exersises;

import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double birthdayMoney = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {  // четен рожден ден
                birthdayMoney += i * 5 - 1;
            } else { // нечетен рожден ден
                toys += 1;
            }
        }
        double moneyTotal = (toys * toyPrice) + (birthdayMoney);
        double diff = Math.abs(moneyTotal - washingMachine);

        if (moneyTotal >= washingMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
